/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << Shaped_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("319cb871-5dbc-422f-addc-3fae607b9e4d")
public class ShapedAssociationEnd {
    @objid ("9ce06f55-5bf1-4865-a735-e124885c6a4d")
    public static final String STEREOTYPE_NAME = "Shaped_AssociationEnd";

    @objid ("7477f6cc-e9d4-447c-9975-37e47ee0afd8")
    public static final String SHAPED_ASSOCIATIONEND_SHAPE_TAGTYPE = "Shaped_AssociationEnd_shape";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("960fe06a-a3fd-44e1-9ab0-11e5c851a70c")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link ShapedAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Shaped_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bea9c198-3f8b-4bd2-8c5c-41652d81f0c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Shaped_AssociationEnd >> then instantiate a {@link ShapedAssociationEnd} proxy.
     * 
     * @return a {@link ShapedAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("41acc090-cd4b-4e02-a89d-49f664898ade")
    public static ShapedAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedAssociationEnd.STEREOTYPE_NAME);
        return ShapedAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ShapedAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Shaped_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ShapedAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("536e9be3-db35-4fb4-9788-b2b4466925cc")
    public static ShapedAssociationEnd instantiate(final AssociationEnd obj) {
        return ShapedAssociationEnd.canInstantiate(obj) ? new ShapedAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ShapedAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Shaped_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link ShapedAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e2fe24c3-848a-4ebe-bca5-e4ebbb1beb8b")
    public static ShapedAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ShapedAssociationEnd.canInstantiate(obj))
        	return new ShapedAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ShapedAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("69c0b434-a53d-4762-a02c-67b88c463cfc")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ShapedAssociationEnd other = (ShapedAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("a3501547-99e8-441e-937b-89396249bdf0")
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Shaped_AssociationEnd_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3406cff-d79d-4872-b8e2-005321c6a017")
    public String getShaped_AssociationEnd_shape() {
        return this.elt.getTagValue(ShapedAssociationEnd.MdaTypes.SHAPED_ASSOCIATIONEND_SHAPE_TAGTYPE_ELT);
    }

    @objid ("6428df7d-bf41-4db3-b0e2-61b5a0ebab8d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_AssociationEnd_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f394352b-cea7-4434-8c4e-e275bd62ae22")
    public void setShaped_AssociationEnd_shape(final String value) {
        this.elt.putTagValue(ShapedAssociationEnd.MdaTypes.SHAPED_ASSOCIATIONEND_SHAPE_TAGTYPE_ELT, value);
    }

    @objid ("1a43d4d5-16ce-4458-b4a6-e771c570ee7e")
    protected ShapedAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("e9ee8368-4ec7-4b01-8ad6-30d77da5ab08")
    public static final class MdaTypes {
        @objid ("f4a4df38-17c3-4fc7-b8ea-c2df1809a6ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("efdda3df-83ef-4d32-b2f4-66f70b818551")
        public static TagType SHAPED_ASSOCIATIONEND_SHAPE_TAGTYPE_ELT;

        @objid ("433c7f1a-416e-43ad-898a-4b503ab3e683")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e4b75a8-2354-4da6-ab2e-bb1b04885c9f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("328ac17f-038b-47bb-9b52-3eee4cc3c8d1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0c9bc8d9-14b5-11df-9d54-0014222a9f79");
            SHAPED_ASSOCIATIONEND_SHAPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0c9bc8da-14b5-11df-9d54-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
