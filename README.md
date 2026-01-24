# refrigerator-ai-backend

refrigerator-ai-backend는  
TV 프로그램 **‘냉장고를 부탁해’**에 등장하는 레시피를 제공하는  
모바일 애플리케이션(냉부 앱)을 위해 구축한 **웹 백엔드 서버 프로젝트**입니다.

Android Studio로 제작한 냉부 앱과 연동되며,  
직접 가공한 레시피 데이터를 데이터베이스에 저장하고  
이를 API 형태로 제공하는 역할을 담당합니다.
   
## 프로젝트 개요

본 프로젝트는  
‘냉장고를 부탁해’ 프로그램에 등장하는 레시피들을 기반으로 한  
모바일 어플리케이션 서비스를 목표로 진행되었습니다.

프로젝트 진행 과정은 다음과 같습니다.

- ‘냉장고를 부탁해’ 레시피 데이터를 직접 수집
- 엑셀을 활용해 레시피 데이터를 정리 및 가공
- 가공된 데이터를 데이터베이스 덤프 파일 형태로 저장
- 해당 데이터를 사용하는 **웹 백엔드 서버 구축**
- Android 앱과 백엔드 서버를 API로 연동

즉,  
**앱 – 백엔드 – 데이터베이스** 구조를 직접 구성하고  
전체 흐름을 경험하는 것을 목표로 한 프로젝트입니다.

## 시스템 구성
- **Backend Server**
  - FastAPI 기반 웹 백엔드 서버
  - 레시피 데이터 제공 API 구현

- **Database**
  - 엑셀로 가공한 레시피 데이터
  - DB 덤프 파일 형태로 저장 후 서버와 연동
  
## Dataset
- Google Sheets와 Excel 수식을 활용해 수집한 레시피 데이터를
재료, 카테고리 기준으로 재구성하여
백엔드에서 활용하기 쉬운 형태로 가공했습니다.

    
## 주요 기능

###  레시피 데이터 제공 API
- 냉장고를 부탁해 레시피 데이터 조회
- 앱에서 사용하기 쉬운 형태로 응답 구조 설계
- 레시피 목록 및 상세 정보 제공

###  앱 연동용 백엔드 서버
- Android 앱과 연동되는 REST API 구성
- 요청/응답 흐름 정리
- Swagger(`/docs`)를 통한 API 테스트 환경 제공

## 기술 스택

- **Backend**
  - Python
  - FastAPI

- **Database**
  - 레시피 데이터 기반 DB
  - 덤프 파일 활용
  - HeidiSQL 사용

- **AI / 데이터 처리**
  - OpenAI API (선택적 사용)
  - 로컬 AI 모델 연동 가능 구조


## 실행 방법

```bash
python -m venv .venv && source .venv/bin/activate
# (Windows)
.venv\Scripts\activate

pip install -r requirements.txt
uvicorn app.main:app --reload
