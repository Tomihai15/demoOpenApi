import uuid

import swagger_server.models.beverage as beverage


def get_mock_beverage_by_id(beverage_id):
    return beverage.Beverage(
        id=beverage_id,
        brand_id=uuid.uuid4().__str__(),
        description='description',
        label_id=uuid.uuid4().__str__(),
        container_type_id=uuid.uuid4().__str__(),
        ingredients=[uuid.uuid4().__str__(), uuid.uuid4().__str__()]
    )