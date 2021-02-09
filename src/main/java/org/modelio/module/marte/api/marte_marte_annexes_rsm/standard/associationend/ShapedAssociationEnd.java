/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class ShapedAssociationEnd {
    public static final String STEREOTYPE_NAME = "Shaped_AssociationEnd";

    public static final String SHAPED_ASSOCIATIONEND_SHAPE_TAGTYPE = "Shaped_AssociationEnd_shape";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link ShapedAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Shaped_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Shaped_AssociationEnd >> then instantiate a {@link ShapedAssociationEnd} proxy.
     * 
     * @return a {@link ShapedAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static ShapedAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedAssociationEnd.STEREOTYPE_NAME);
        return ShapedAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ShapedAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Shaped_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ShapedAssociationEnd} proxy or <i>null</i>.
     */
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
    public static ShapedAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ShapedAssociationEnd.canInstantiate(obj))
        	return new ShapedAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ShapedAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Shaped_AssociationEnd_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getShaped_AssociationEnd_shape() {
        return this.elt.getTagValue(ShapedAssociationEnd.MdaTypes.SHAPED_ASSOCIATIONEND_SHAPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_AssociationEnd_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setShaped_AssociationEnd_shape(final String value) {
        this.elt.putTagValue(ShapedAssociationEnd.MdaTypes.SHAPED_ASSOCIATIONEND_SHAPE_TAGTYPE_ELT, value);
    }

    protected ShapedAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SHAPED_ASSOCIATIONEND_SHAPE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
