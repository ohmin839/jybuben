CREATE SCHEMA IF NOT EXISTS app;
CREATE TABLE IF NOT EXISTS app.t_raw_word(
  id IDENTITY PRIMARY KEY,
  val VARCHAR(255) UNIQUE NOT NULL
);