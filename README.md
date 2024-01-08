# maven-multimodule 

메이븐 멀티모듈 구현 테스트

main project
ㄴ core
ㄴ library A
ㄴ library B
ㄴ release

core: Main 메서드가 위치한다.
library A, B: core에종속된 라이브러리 모듈
release: 메인에서 빌드 시 전체 프로젝트를 assemble 해주는 모듈
         assembly.xml 파일에서 어떤 식으로 압축 파일을 만들 것인지 지정 가능
         혹은 그냥 jar-with-dependencies 를 java -jar 로 실행시켜도 됨
         release 에서 가장 최상위 프로젝트를 (core) 디펜던시에 넣으면
         하위 종속성들은 딸려 들어온다.

* 빌드가 되지 않을 시에는 메이븐 플러그인 확인
