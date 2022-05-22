package infrastructure

import (
	"net/http"

	"github.com/labstack/echo/v4"
	"github.com/sapo/poc-echo/internal/domain/entity"
	"github.com/sapo/poc-echo/internal/infrastructure/server"
)

func Start() {
	e := server.Config()

	e.GET("/healthcheck", HealthcheckHandler)

	e.Logger.Fatal(e.Start(":8080"))
}

func HealthcheckHandler(c echo.Context) error {
	return c.JSON(http.StatusOK, entity.Healthcheck{
		Message: "It works!",
	})
}
