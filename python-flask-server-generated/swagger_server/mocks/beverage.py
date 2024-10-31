import uuid

from swagger_server.models.beverage import Beverage
from swagger_server.models.beverage_links import BeverageLinks

def get_mock_beverage_by_id(beverage_id):
    return Beverage(
        id=beverage_id,
        brand_id=uuid.uuid4().__str__(),
        description='description',
        label_id=uuid.uuid4().__str__(),
        container_type_id=uuid.uuid4().__str__(),
        ingredients=[uuid.uuid4().__str__(), uuid.uuid4().__str__()],
        links=[
            BeverageLinks(rel='self', href='http://localhost:8080/beverages/' + beverage_id),
            BeverageLinks(rel='brand', href='http://localhost:8080/brands/' + uuid.uuid4().__str__()),
            BeverageLinks(rel='label', href='http://localhost:8080/labels/' + uuid.uuid4().__str__()),
            BeverageLinks(rel='container', href='http://localhost:8080/containers/' + uuid.uuid4().__str__())
        ]

    )


def get_mock_beverage_list():
    return [
        get_mock_beverage_by_id(uuid.uuid4().__str__()),
        get_mock_beverage_by_id(uuid.uuid4().__str__()),
        get_mock_beverage_by_id(uuid.uuid4().__str__())
    ]