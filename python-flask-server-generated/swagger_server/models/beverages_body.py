# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class BeveragesBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, description: str=None, brand_id: str=None, label_id: str=None, container_type_id: str=None, ingredients: List[str]=None):  # noqa: E501
        """BeveragesBody - a model defined in Swagger

        :param description: The description of this BeveragesBody.  # noqa: E501
        :type description: str
        :param brand_id: The brand_id of this BeveragesBody.  # noqa: E501
        :type brand_id: str
        :param label_id: The label_id of this BeveragesBody.  # noqa: E501
        :type label_id: str
        :param container_type_id: The container_type_id of this BeveragesBody.  # noqa: E501
        :type container_type_id: str
        :param ingredients: The ingredients of this BeveragesBody.  # noqa: E501
        :type ingredients: List[str]
        """
        self.swagger_types = {
            'description': str,
            'brand_id': str,
            'label_id': str,
            'container_type_id': str,
            'ingredients': List[str]
        }

        self.attribute_map = {
            'description': 'description',
            'brand_id': 'brandId',
            'label_id': 'labelId',
            'container_type_id': 'containerTypeId',
            'ingredients': 'ingredients'
        }
        self._description = description
        self._brand_id = brand_id
        self._label_id = label_id
        self._container_type_id = container_type_id
        self._ingredients = ingredients

    @classmethod
    def from_dict(cls, dikt) -> 'BeveragesBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The beverages_body of this BeveragesBody.  # noqa: E501
        :rtype: BeveragesBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this BeveragesBody.


        :return: The description of this BeveragesBody.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this BeveragesBody.


        :param description: The description of this BeveragesBody.
        :type description: str
        """

        self._description = description

    @property
    def brand_id(self) -> str:
        """Gets the brand_id of this BeveragesBody.


        :return: The brand_id of this BeveragesBody.
        :rtype: str
        """
        return self._brand_id

    @brand_id.setter
    def brand_id(self, brand_id: str):
        """Sets the brand_id of this BeveragesBody.


        :param brand_id: The brand_id of this BeveragesBody.
        :type brand_id: str
        """
        if brand_id is None:
            raise ValueError("Invalid value for `brand_id`, must not be `None`")  # noqa: E501

        self._brand_id = brand_id

    @property
    def label_id(self) -> str:
        """Gets the label_id of this BeveragesBody.


        :return: The label_id of this BeveragesBody.
        :rtype: str
        """
        return self._label_id

    @label_id.setter
    def label_id(self, label_id: str):
        """Sets the label_id of this BeveragesBody.


        :param label_id: The label_id of this BeveragesBody.
        :type label_id: str
        """
        if label_id is None:
            raise ValueError("Invalid value for `label_id`, must not be `None`")  # noqa: E501

        self._label_id = label_id

    @property
    def container_type_id(self) -> str:
        """Gets the container_type_id of this BeveragesBody.


        :return: The container_type_id of this BeveragesBody.
        :rtype: str
        """
        return self._container_type_id

    @container_type_id.setter
    def container_type_id(self, container_type_id: str):
        """Sets the container_type_id of this BeveragesBody.


        :param container_type_id: The container_type_id of this BeveragesBody.
        :type container_type_id: str
        """
        if container_type_id is None:
            raise ValueError("Invalid value for `container_type_id`, must not be `None`")  # noqa: E501

        self._container_type_id = container_type_id

    @property
    def ingredients(self) -> List[str]:
        """Gets the ingredients of this BeveragesBody.


        :return: The ingredients of this BeveragesBody.
        :rtype: List[str]
        """
        return self._ingredients

    @ingredients.setter
    def ingredients(self, ingredients: List[str]):
        """Sets the ingredients of this BeveragesBody.


        :param ingredients: The ingredients of this BeveragesBody.
        :type ingredients: List[str]
        """

        self._ingredients = ingredients
