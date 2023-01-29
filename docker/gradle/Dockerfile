FROM gradle:7.6.0-jdk8-focal

ARG UID=1001
ARG GID=1001
ARG USERNAME=user
RUN groupadd -g $GID $USERNAME && \
    useradd -m -s /bin/bash -u $UID -g $GID $USERNAME

CMD ["tail", "-f", "/dev/null"]
USER $USERNAME
