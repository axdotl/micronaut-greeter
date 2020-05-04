FROM gcr.io/distroless/java:11

WORKDIR /axdotl

COPY ${project.build.finalName}.jar /axdotl/${project.build.finalName}.jar
COPY lib /axdotl/lib

CMD [ "/axdotl/${project.build.finalName}.jar" ]