# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class ErrorResponseError(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, code: int=None, message: str=None):  # noqa: E501
        """ErrorResponseError - a model defined in Swagger

        :param code: The code of this ErrorResponseError.  # noqa: E501
        :type code: int
        :param message: The message of this ErrorResponseError.  # noqa: E501
        :type message: str
        """
        self.swagger_types = {
            'code': int,
            'message': str
        }

        self.attribute_map = {
            'code': 'code',
            'message': 'message'
        }
        self._code = code
        self._message = message

    @classmethod
    def from_dict(cls, dikt) -> 'ErrorResponseError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ErrorResponse_error of this ErrorResponseError.  # noqa: E501
        :rtype: ErrorResponseError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def code(self) -> int:
        """Gets the code of this ErrorResponseError.

        HTTP status code.  # noqa: E501

        :return: The code of this ErrorResponseError.
        :rtype: int
        """
        return self._code

    @code.setter
    def code(self, code: int):
        """Sets the code of this ErrorResponseError.

        HTTP status code.  # noqa: E501

        :param code: The code of this ErrorResponseError.
        :type code: int
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")  # noqa: E501

        self._code = code

    @property
    def message(self) -> str:
        """Gets the message of this ErrorResponseError.

        Error message.  # noqa: E501

        :return: The message of this ErrorResponseError.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this ErrorResponseError.

        Error message.  # noqa: E501

        :param message: The message of this ErrorResponseError.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")  # noqa: E501

        self._message = message
