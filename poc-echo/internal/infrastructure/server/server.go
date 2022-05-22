package server

import (
	"github.com/labstack/echo/v4"
)

func Config() (e *echo.Echo) {
	e = echo.New()

	return e
}
