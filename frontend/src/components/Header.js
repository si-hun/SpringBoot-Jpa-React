import React from 'react';
import {Container, Form, FormControl, Nav, Navbar} from "react-bootstrap";
import {Link} from "react-router-dom";

const Header = () => {
    return (
        <>
            <Navbar bg="dark" variant="dark">
                <Container>
                    <Link to={"/"} className="navbar-brand">홈</Link>
                    <Nav className="me-auto">
                        <Link to={"/board/write"} className="nav-link">글쓰기</Link>
                    </Nav>
                </Container>
            </Navbar>
        </>
    );
};

export default Header;