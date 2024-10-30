import connexion
import six

from swagger_server.models.brand import Brand  # noqa: E501
from swagger_server.models.brands_body import BrandsBody  # noqa: E501
from swagger_server.models.brands_id_body import BrandsIdBody  # noqa: E501
from swagger_server.models.brands_id_body1 import BrandsIdBody1  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server import util


def create_brand(body):  # noqa: E501
    """Create a new brand

    Creates a new brand. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = BrandsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_brand(id):  # noqa: E501
    """Delete a brand

    Deletes a brand. # noqa: E501

    :param id: Unique identifier for the brand.
    :type id: 

    :rtype: None
    """
    return 'do some magic!'


def get_brand_by_id(id):  # noqa: E501
    """Retrieve a brand by ID

    Retrieves details of a specific brand. # noqa: E501

    :param id: Unique identifier for the brand.
    :type id: 

    :rtype: Brand
    """
    return 'do some magic!'


def get_brands(page=None, per_page=None):  # noqa: E501
    """Retrieve all brand

    Retrieves a list of all brands. # noqa: E501

    :param page: Page number.
    :type page: int
    :param per_page: Number of items per page.
    :type per_page: int

    :rtype: List[Brand]
    """
    return 'do some magic!'


def replace_brand(body, id):  # noqa: E501
    """Update a brand

    Create or replace an existing brand. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param id: Unique identifier for the brand.
    :type id: 

    :rtype: None
    """
    if connexion.request.is_json:
        body = BrandsIdBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_brand(body, id):  # noqa: E501
    """Partially update a brand

    Update an existing brand. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param id: Unique identifier for the brand.
    :type id: 

    :rtype: None
    """
    if connexion.request.is_json:
        body = BrandsIdBody1.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
