# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class IngredientsBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, name: str=None, allergen_info: str=None):  # noqa: E501
        """IngredientsBody - a model defined in Swagger

        :param name: The name of this IngredientsBody.  # noqa: E501
        :type name: str
        :param allergen_info: The allergen_info of this IngredientsBody.  # noqa: E501
        :type allergen_info: str
        """
        self.swagger_types = {
            'name': str,
            'allergen_info': str
        }

        self.attribute_map = {
            'name': 'name',
            'allergen_info': 'allergen_info'
        }
        self._name = name
        self._allergen_info = allergen_info

    @classmethod
    def from_dict(cls, dikt) -> 'IngredientsBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ingredients_body of this IngredientsBody.  # noqa: E501
        :rtype: IngredientsBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this IngredientsBody.


        :return: The name of this IngredientsBody.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this IngredientsBody.


        :param name: The name of this IngredientsBody.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def allergen_info(self) -> str:
        """Gets the allergen_info of this IngredientsBody.


        :return: The allergen_info of this IngredientsBody.
        :rtype: str
        """
        return self._allergen_info

    @allergen_info.setter
    def allergen_info(self, allergen_info: str):
        """Sets the allergen_info of this IngredientsBody.


        :param allergen_info: The allergen_info of this IngredientsBody.
        :type allergen_info: str
        """

        self._allergen_info = allergen_info
