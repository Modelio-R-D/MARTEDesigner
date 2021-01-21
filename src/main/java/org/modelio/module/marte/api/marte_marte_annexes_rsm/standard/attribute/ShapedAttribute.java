/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.attribute;

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
@objid ("3f1fa930-b649-4fd8-a58e-0bf3f47d4d1d")
public class ShapedAttribute {
    @objid ("221b8aae-bc5f-40ba-99e9-3e513a4eafa4")
    public static final String STEREOTYPE_NAME = "Shaped_Attribute";

    @objid ("591646a7-75ea-408b-acb4-5615c44537f7")
    public static final String SHAPED_ATTRIBUTE_SHAPE_TAGTYPE = "Shaped_Attribute_shape";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("e0418723-bc08-49e5-833c-7c6889c4af78")
    protected final Attribute elt;

    /**
     * Tells whether a {@link ShapedAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Shaped_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3e3e6701-018d-4eea-b1dd-2ba7c810bea8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Shaped_Attribute >> then instantiate a {@link ShapedAttribute} proxy.
     * 
     * @return a {@link ShapedAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("49562b89-7e03-4584-a878-618356a296a4")
    public static ShapedAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedAttribute.STEREOTYPE_NAME);
        return ShapedAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ShapedAttribute} proxy from a {@link Attribute} stereotyped << Shaped_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ShapedAttribute} proxy or <i>null</i>.
     */
    @objid ("7bd4d916-cd79-4959-a99b-40f6be340b24")
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
    @objid ("fde2ef48-563e-4bd7-81ad-cb94538b42c7")
    public static ShapedAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ShapedAttribute.canInstantiate(obj))
        	return new ShapedAttribute(obj);
        else
        	throw new IllegalArgumentException("ShapedAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("32008445-baab-4bbe-a675-9d8aad061ad5")
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
    @objid ("65280e1b-da18-4796-aae3-a932f7f7a727")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Shaped_Attribute_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5c8c231-ca6c-4767-8ac9-3821e743b5d4")
    public String getShaped_Attribute_shape() {
        return this.elt.getTagValue(ShapedAttribute.MdaTypes.SHAPED_ATTRIBUTE_SHAPE_TAGTYPE_ELT);
    }

    @objid ("c144ed9b-6749-42ef-8773-b65dcf5880e9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_Attribute_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d5a3434-dafb-4856-9f8a-88cf54c28ec1")
    public void setShaped_Attribute_shape(final String value) {
        this.elt.putTagValue(ShapedAttribute.MdaTypes.SHAPED_ATTRIBUTE_SHAPE_TAGTYPE_ELT, value);
    }

    @objid ("d4f69943-0eaa-4491-a223-eca0cde2e860")
    protected ShapedAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("dd04862e-31bb-4f9a-8c9c-ebfff19d2423")
    public static final class MdaTypes {
        @objid ("c35378bb-17bc-47f9-b11b-0633d4205c35")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5e7ce3cb-a8ee-4c2e-bbc6-45597e17dd67")
        public static TagType SHAPED_ATTRIBUTE_SHAPE_TAGTYPE_ELT;

        @objid ("dfedc931-497d-4107-a3ab-5d1cd4e81181")
        private static Stereotype MDAASSOCDEP;

        @objid ("a118d16c-cf7b-4995-a83c-d898d09ed609")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48803780-0ebd-4069-bb6d-6b278dfb8cbe")
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
