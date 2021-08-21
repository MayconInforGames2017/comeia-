import routerProducts from "@modules/product/routes/product.routes";
import { Router } from "express";

const routes = Router();

routes.use('/products', routerProducts);

export default routes;