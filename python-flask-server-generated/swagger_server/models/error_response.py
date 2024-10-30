# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.error_response_error import ErrorResponseError  # noqa: F401,E501
from swagger_server import util


class ErrorResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, error: ErrorResponseError=None):  # noqa: E501
        """ErrorResponse - a model defined in Swagger

        :param error: The error of this ErrorResponse.  # noqa: E501
        :type error: ErrorResponseError
        """
        self.swagger_types = {
            'error': ErrorResponseError
        }

        self.attribute_map = {
            'error': 'error'
        }
        self._error = error

    @classmethod
    def from_dict(cls, dikt) -> 'ErrorResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ErrorResponse of this ErrorResponse.  # noqa: E501
        :rtype: ErrorResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def error(self) -> ErrorResponseError:
        """Gets the error of this ErrorResponse.


        :return: The error of this ErrorResponse.
        :rtype: ErrorResponseError
        """
        return self._error

    @error.setter
    def error(self, error: ErrorResponseError):
        """Sets the error of this ErrorResponse.


        :param error: The error of this ErrorResponse.
        :type error: ErrorResponseError
        """

        self._error = error
