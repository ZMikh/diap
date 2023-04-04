CREATE TABLE application (
    id                     BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    lastname               TEXT NOT NULL,
    firstname              TEXT NOT NULL,
    middlename             TEXT NOT NULL,
    type                   TEXT NOT NULL,
    license_date_of_issue  DATE NOT NULL,
    license_series         TEXT NOT NULL,
    license_number         BIGINT NOT NULL,
    state                  TEXT NOT NULL,
    resource_count         INT NOT NULL CHECK(resource_count >= 0),
    creation_date          DATE NOT NULL DEFAULT CURRENT_DATE,
    resource_id            BIGINT NOT NULL,

    CONSTRAINT fk_resource_application FOREIGN KEY (resource_id) REFERENCES resource (id) ON DELETE CASCADE
);