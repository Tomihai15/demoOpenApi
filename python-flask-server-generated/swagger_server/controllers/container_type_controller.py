import connexion
import six

from swagger_server.models.container_type import ContainerType  # noqa: E501
from swagger_server.models.containertypes_body import ContainertypesBody  # noqa: E501
from swagger_server.models.containertypes_id_body import ContainertypesIdBody  # noqa: E501
from swagger_server.models.containertypes_id_body1 import ContainertypesIdBody1  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from swagger_server import util


def create_container_type(body):  # noqa: E501
    """Create a new container type

    Creates a new container type. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = ContainertypesBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_container_type(id):  # noqa: E501
    """Delete a container type

    Deletes a container type. # noqa: E501

    :param id: Unique identifier for the container type.
    :type id: 

    :rtype: None
    """
    return 'do some magic!'


def get_container_type_by_id(id):  # noqa: E501
    """Retrieve a container type by ID

    Retrieves details of a specific container type. # noqa: E501

    :param id: Unique identifier for the container type.
    :type id: 

    :rtype: ContainerType
    """
    return 'do some magic!'


def get_container_types():  # noqa: E501
    """Retrieve all container types

    Retrieves a list of all container types. # noqa: E501


    :rtype: List[ContainerType]
    """
    return 'do some magic!'


def put_container_type(body, id):  # noqa: E501
    """Update a container type

    Create or replace a container type. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param id: Unique identifier for the container type.
    :type id: 

    :rtype: InlineResponse2001
    """
    if connexion.request.is_json:
        body = ContainertypesIdBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_container_type(body, id):  # noqa: E501
    """Update a container type

    Updates an existing container type. # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param id: Unique identifier for the container type.
    :type id: 

    :rtype: InlineResponse2001
    """
    if connexion.request.is_json:
        body = ContainertypesIdBody1.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
