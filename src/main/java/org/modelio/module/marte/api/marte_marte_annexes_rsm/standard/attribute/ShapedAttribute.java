/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << Shaped_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ShapedAttribute {
    public static final String STEREOTYPE_NAME = "Shaped_Attribute";

    public static final String SHAPED_ATTRIBUTE_SHAPE_TAGTYPE = "Shaped_Attribute_shape";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    protected final Attribute elt;

    /**
     * Tells whether a {@link ShapedAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Shaped_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Shaped_Attribute >> then instantiate a {@link ShapedAttribute} proxy.
     * 
     * @return a {@link ShapedAttribute} proxy on the created {@link Attribute}.
     */
    public static ShapedAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedAttribute.STEREOTYPE_NAME);
        return ShapedAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ShapedAttribute} proxy from a {@link Attribute} stereotyped << Shaped_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ShapedAttribute} proxy or <i>null</i>.
     */
    public static ShapedAttribute instantiate(final Attribute obj) {
        return ShapedAttribute.canInstantiate(obj) ? new ShapedAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ShapedAttribute} proxy from a {@link Attribute} stereotyped << Shaped_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link ShapedAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ShapedAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ShapedAttribute.canInstantiate(obj))
        	return new ShapedAttribute(obj);
        else
        	throw new IllegalArgumentException("ShapedAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ShapedAttribute other = (ShapedAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Shaped_Attribute_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getShaped_Attribute_shape() {
        return this.elt.getTagValue(ShapedAttribute.MdaTypes.SHAPED_ATTRIBUTE_SHAPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_Attribute_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setShaped_Attribute_shape(final String value) {
        this.elt.putTagValue(ShapedAttribute.MdaTypes.SHAPED_ATTRIBUTE_SHAPE_TAGTYPE_ELT, value);
    }

    protected ShapedAttribute(final Attribute elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SHAPED_ATTRIBUTE_SHAPE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0cd501a9-14b5-11df-9d54-0014222a9f79");
            SHAPED_ATTRIBUTE_SHAPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cd501aa-14b5-11df-9d54-0014222a9f79");
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
