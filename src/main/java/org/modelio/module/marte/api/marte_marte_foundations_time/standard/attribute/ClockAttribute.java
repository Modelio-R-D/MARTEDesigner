/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << Clock_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a59c2f3a-9589-44e1-95d3-b3a2e95f1867")
public class ClockAttribute {
    @objid ("fe62698b-611b-40fc-9887-1b60836e85d3")
    public static final String STEREOTYPE_NAME = "Clock_Attribute";

    @objid ("f3820f0f-0469-43ab-a494-653e582e920f")
    public static final String CLOCK_ATTRIBUTE_STANDARD_TAGTYPE = "Clock_Attribute_standard";

    @objid ("88e20d83-1ab2-47d3-9c7a-9390129274d6")
    public static final String CLOCK_ATTRIBUTE_TYPE_TAGTYPE = "Clock_Attribute_type";

    @objid ("31fabd18-f9bf-485e-baa6-3ba9e7a53213")
    public static final String CLOCK_ATTRIBUTE_UNIT_TAGTYPE = "Clock_Attribute_unit";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("fc80e388-5e74-4da1-8948-0aeaa0e2cffc")
    protected final Attribute elt;

    /**
     * Tells whether a {@link ClockAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Clock_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("53f555ed-2c3b-4b2e-a8f3-297de47a8238")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Clock_Attribute >> then instantiate a {@link ClockAttribute} proxy.
     * 
     * @return a {@link ClockAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("85114c77-91d6-4bac-bf13-c2b914066ccf")
    public static ClockAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockAttribute.STEREOTYPE_NAME);
        return ClockAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ClockAttribute} proxy from a {@link Attribute} stereotyped << Clock_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ClockAttribute} proxy or <i>null</i>.
     */
    @objid ("2d10ec18-cdb4-4fba-a97d-0861e49385ff")
    public static ClockAttribute instantiate(final Attribute obj) {
        return ClockAttribute.canInstantiate(obj) ? new ClockAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockAttribute} proxy from a {@link Attribute} stereotyped << Clock_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link ClockAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f60b2fba-fa1d-401c-b3da-c7edb9b61043")
    public static ClockAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ClockAttribute.canInstantiate(obj))
        	return new ClockAttribute(obj);
        else
        	throw new IllegalArgumentException("ClockAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77cc9e3e-6e77-4a39-a76d-64b27cb56825")
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
        ClockAttribute other = (ClockAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_Attribute_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cbe21de8-6a3e-4c70-bf12-aa7395c26d05")
    public String getClock_Attribute_standard() {
        return this.elt.getTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("267d9fed-72d7-4479-b9d5-c02f12359b48")
    public String getClock_Attribute_type() {
        return this.elt.getTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Attribute_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0512a9fa-9186-474b-ad66-09bb9aabcd28")
    public String getClock_Attribute_unit() {
        return this.elt.getTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("f5df670c-fd0b-4ec3-8e3d-75de6fc0022d")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("1d9e0f77-4e61-4a2d-be99-f96eb1dde549")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Attribute_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9eb4c8d-77c8-49f9-b843-4c237dbc727a")
    public void setClock_Attribute_standard(final String value) {
        this.elt.putTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f081b115-d3fa-4da0-b964-4a123e09ddf2")
    public void setClock_Attribute_type(final String value) {
        this.elt.putTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Attribute_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ac92d6c-4d6d-4c59-ac88-9c06f838c0e9")
    public void setClock_Attribute_unit(final String value) {
        this.elt.putTagValue(ClockAttribute.MdaTypes.CLOCK_ATTRIBUTE_UNIT_TAGTYPE_ELT, value);
    }

    @objid ("710dce62-1320-440a-b9bf-01563d837bf1")
    protected ClockAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("bbb99485-5f60-4900-b4e8-7ec71c1e3004")
    public static final class MdaTypes {
        @objid ("55b86453-afeb-4074-b15b-c8029e96f664")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("14c536d5-557e-4f12-9546-44e3988f9e72")
        public static TagType CLOCK_ATTRIBUTE_STANDARD_TAGTYPE_ELT;

        @objid ("79e275fe-89ce-4d03-95ad-671fbafecd78")
        public static TagType CLOCK_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        @objid ("31b75bbe-82c5-4e57-bcef-710ea184a0eb")
        public static TagType CLOCK_ATTRIBUTE_UNIT_TAGTYPE_ELT;

        @objid ("c71bc780-2433-4aa5-b740-3277edf589e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("7d658b4c-fe5c-4b63-b768-d39db1b1d061")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("acdd49db-2c9b-4f49-aaae-e097994dc609")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dad723f3-0cce-11df-8525-001302895b2b");
            CLOCK_ATTRIBUTE_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae30f90-0cce-11df-8525-001302895b2b");
            CLOCK_ATTRIBUTE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571df-0cce-11df-8525-001302895b2b");
            CLOCK_ATTRIBUTE_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e6-0cce-11df-8525-001302895b2b");
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
