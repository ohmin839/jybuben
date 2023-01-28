FROM gradle:7.6.0-jdk8-focal

ARG UID=1001
ARG GID=1001
ARG USERNAME=user
RUN groupadd -g $GID $USERNAME && \
    useradd -m -s /bin/bash -u $UID -g $GID $USERNAME

COPY ./docker/api/entrypoint.sh /
RUN chmod +x /entrypoint.sh
# CMD ["/entrypoint.sh"]
CMD ["tail", "-f", "/dev/null"]

USER $USERNAME
WORKDIR /jybuben-api
