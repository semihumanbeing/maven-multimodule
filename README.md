# maven-multimodule 

메이븐 멀티모듈 구현 테스트<br>
여러개의 모듈을 가진 프로젝트를 빌드하면 라이브러리 모듈을 참조할 수 있는 하나의 Jar 파일을 Release 에 만들수 있다.

main project<br>
ㄴ core<br>
ㄴ library A<br>
ㄴ library B<br>
ㄴ release<br>
<br>
- core: Main 메서드가 위치한다.<br>
- library A, B: core에종속된 라이브러리 모듈<br>
- release: 메인에서 빌드 시 전체 프로젝트를 assemble 해주는 모듈<br>
         assembly.xml 파일에서 어떤 식으로 압축 파일을 만들 것인지 지정 가능<br>
         혹은 그냥 jar-with-dependencies 를 java -jar 로 실행시켜도 됨<br>
         release 에서 가장 최상위 프로젝트를 (core) 디펜던시에 넣으면<br>
         하위 종속성들은 딸려 들어온다.<br>
<br><br>
* 빌드가 되지 않을 시에는 메이븐 플러그인을 plugins 에 추가했는지 확인
