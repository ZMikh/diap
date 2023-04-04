CREATE TABLE resource (
    id              BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    region          TEXT NOT NULL,
    name            TEXT NOT NULL,
    state           TEXT,
    start_date      DATE NOT NULL,
    finish_date     DATE NOT NULL,
    quota           INT NOT NULL
);