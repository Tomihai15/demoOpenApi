# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class ContainertypesBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, type: str=None, volume: float=None):  # noqa: E501
        """ContainertypesBody - a model defined in Swagger

        :param type: The type of this ContainertypesBody.  # noqa: E501
        :type type: str
        :param volume: The volume of this ContainertypesBody.  # noqa: E501
        :type volume: float
        """
        self.swagger_types = {
            'type': str,
            'volume': float
        }

        self.attribute_map = {
            'type': 'type',
            'volume': 'volume'
        }
        self._type = type
        self._volume = volume

    @classmethod
    def from_dict(cls, dikt) -> 'ContainertypesBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The containertypes_body of this ContainertypesBody.  # noqa: E501
        :rtype: ContainertypesBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this ContainertypesBody.


        :return: The type of this ContainertypesBody.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this ContainertypesBody.


        :param type: The type of this ContainertypesBody.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def volume(self) -> float:
        """Gets the volume of this ContainertypesBody.


        :return: The volume of this ContainertypesBody.
        :rtype: float
        """
        return self._volume

    @volume.setter
    def volume(self, volume: float):
        """Sets the volume of this ContainertypesBody.


        :param volume: The volume of this ContainertypesBody.
        :type volume: float
        """
        if volume is None:
            raise ValueError("Invalid value for `volume`, must not be `None`")  # noqa: E501

        self._volume = volume
