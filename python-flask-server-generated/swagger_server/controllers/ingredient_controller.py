import connexion
import six

from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.ingredient import Ingredient  # noqa: E501
from swagger_server.models.ingredients_body import IngredientsBody  # noqa: E501
from swagger_server.models.ingredients_id_body import IngredientsIdBody  # noqa: E501
from swagger_server.models.ingredients_id_body1 import IngredientsIdBody1  # noqa: E501
from swagger_server import util


def create_ingredient(body):  # noqa: E501
    """Create a new ingredient

    Creates a new ingredient. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = IngredientsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_ingredient(id):  # noqa: E501
    """Delete an ingredient

    Deletes an ingredient. # noqa: E501

    :param id: Unique identifier for the ingredient.
    :type id: 

    :rtype: None
    """
    return 'do some magic!'


def get_ingredient_by_id(id):  # noqa: E501
    """Retrieve an ingredient by ID

    Retrieves details of a specific ingredient. # noqa: E501

    :param id: Unique identifier for the ingredient.
    :type id: 

    :rtype: Ingredient
    """
    return 'do some magic!'


def get_ingredients():  # noqa: E501
    """Retrieve all ingredients

    Retrieves a list of all ingredients. # noqa: E501


    :rtype: List[Ingredient]
    """
    return 'do some magic!'


def replace_ingredient(body, id):  # noqa: E501
    """Update an ingredient

    Create or Replace an existing ingredient. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param id: Unique identifier for the ingredient.
    :type id: 

    :rtype: None
    """
    if connexion.request.is_json:
        body = IngredientsIdBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_ingredient(body, id):  # noqa: E501
    """Update an ingredient

    Updates an existing ingredient. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param id: Unique identifier for the ingredient.
    :type id: 

    :rtype: None
    """
    if connexion.request.is_json:
        body = IngredientsIdBody1.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
