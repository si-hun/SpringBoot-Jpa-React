import React from 'react';
import {Container, Nav, Navbar} from "react-bootstrap";
import {Link} from "react-router-dom";

const Header = () => {
    return (
        <>
            <Navbar bg="dark" variant="dark">
                <Container>
                    <Link to={"/"} className="navbar-brand">홈</Link>
                    <Nav className="me-auto">
                        <Link to={"/board/write"} className="nav-link">글쓰기</Link>
                        <Link to={"/board/list"} className="nav-link">리스트</Link>
                    </Nav>
                </Container>
            </Navbar>
        </>
    );
};

export default Header;