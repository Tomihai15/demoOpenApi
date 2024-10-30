# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class ContainerType(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, id: str=None, type: str=None, volume: int=None):  # noqa: E501
        """ContainerType - a model defined in Swagger

        :param id: The id of this ContainerType.  # noqa: E501
        :type id: str
        :param type: The type of this ContainerType.  # noqa: E501
        :type type: str
        :param volume: The volume of this ContainerType.  # noqa: E501
        :type volume: int
        """
        self.swagger_types = {
            'id': str,
            'type': str,
            'volume': int
        }

        self.attribute_map = {
            'id': 'id',
            'type': 'type',
            'volume': 'volume'
        }
        self._id = id
        self._type = type
        self._volume = volume

    @classmethod
    def from_dict(cls, dikt) -> 'ContainerType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ContainerType of this ContainerType.  # noqa: E501
        :rtype: ContainerType
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this ContainerType.

        Unique identifier for the container type.  # noqa: E501

        :return: The id of this ContainerType.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ContainerType.

        Unique identifier for the container type.  # noqa: E501

        :param id: The id of this ContainerType.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this ContainerType.

        Type of container (e.g., Bottle, Can).  # noqa: E501

        :return: The type of this ContainerType.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this ContainerType.

        Type of container (e.g., Bottle, Can).  # noqa: E501

        :param type: The type of this ContainerType.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def volume(self) -> int:
        """Gets the volume of this ContainerType.

        Volume in milliliters.  # noqa: E501

        :return: The volume of this ContainerType.
        :rtype: int
        """
        return self._volume

    @volume.setter
    def volume(self, volume: int):
        """Sets the volume of this ContainerType.

        Volume in milliliters.  # noqa: E501

        :param volume: The volume of this ContainerType.
        :type volume: int
        """
        if volume is None:
            raise ValueError("Invalid value for `volume`, must not be `None`")  # noqa: E501

        self._volume = volume
