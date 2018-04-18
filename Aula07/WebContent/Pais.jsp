<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Pais</title>
		
		<link href="css/bootstrap.min.css" rel="stylesheet">
	    <link href="css/style.css" rel="stylesheet">
	</head>
	<body>
	        <!-- Barra superior com os menus de navegação -->
			<c:import url="Menu.jsp"/>
	        <!-- Container Principal -->
	        <div id="main" class="container">
	            <h3 class="page-header">ID do Pais #${ pais.id }</h3>
	            <div class="row">
	                <div class="col-md-12">
	                    <p><strong>Pais</strong>
	                    </p>
	                    <p>
	                        ${ pais.nome }
	                    </p>
	                </div>
	            </div>
	            <div class="row">
	                <div class="col-md-6">
	                    <p><strong>População</strong>
	                    </p>
	                    <p>
	                        ${ pais.populacao }
	                    </p>
	                </div>
	                <div class="col-md-6">
	                    <p><strong>Area em M²</strong>
	                    </p>
	                    <p>
	                        ${ pais.area }
	                    </p>
	                </div>
	            </div>
	            <hr />
	            <div id="actions" class="row">
	                <div class="col-md-12">
	                    <a href="PaisIndex.jsp" class="btn btn-default">Voltar</a>
	                </div>
	            </div>
	        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
	</body>
</html>