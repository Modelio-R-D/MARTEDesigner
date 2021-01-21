/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << Var_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fa6b9cf4-33c2-4994-9790-00bf20d0a860")
public class VarAttribute {
    @objid ("92559e6f-80e9-426e-9866-1d8084b30c7e")
    public static final String STEREOTYPE_NAME = "Var_Attribute";

    @objid ("a292643b-defd-4270-b5a0-4287588d0f1e")
    public static final String VAR_ATTRIBUTE_DIR_TAGTYPE = "Var_Attribute_dir";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("63dcf721-055b-4ddc-90cc-dac5b1098f14")
    protected final Attribute elt;

    /**
     * Tells whether a {@link VarAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Var_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("812c2c62-a83d-4b2e-b088-8ffe948b7b04")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, VarAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Var_Attribute >> then instantiate a {@link VarAttribute} proxy.
     * 
     * @return a {@link VarAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("02b74a40-19c3-491d-a0c1-93edc64ab17f")
    public static VarAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, VarAttribute.STEREOTYPE_NAME);
        return VarAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link VarAttribute} proxy from a {@link Attribute} stereotyped << Var_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link VarAttribute} proxy or <i>null</i>.
     */
    @objid ("281d53d6-925f-43d7-ac51-5b2abeb653f8")
    public static VarAttribute instantiate(final Attribute obj) {
        return VarAttribute.canInstantiate(obj) ? new VarAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VarAttribute} proxy from a {@link Attribute} stereotyped << Var_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link VarAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("97d2d803-b3f1-4207-a9f7-b9efd426c841")
    public static VarAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (VarAttribute.canInstantiate(obj))
        	return new VarAttribute(obj);
        else
        	throw new IllegalArgumentException("VarAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("862688f5-e3e9-4a88-b2ab-b20141ecc608")
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
        VarAttribute other = (VarAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("390f80f5-3839-4d9e-9865-ab3ead5c72bf")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Var_Attribute_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02280218-6de0-4b8d-8689-5fce1ced241b")
    public String getVar_Attribute_dir() {
        return this.elt.getTagValue(VarAttribute.MdaTypes.VAR_ATTRIBUTE_DIR_TAGTYPE_ELT);
    }

    @objid ("86a1e4d6-ab76-44a2-a330-a86fc856ca71")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Var_Attribute_dir'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a024c9b7-a605-4bb8-9f41-325f97b4a2b3")
    public void setVar_Attribute_dir(final String value) {
        this.elt.putTagValue(VarAttribute.MdaTypes.VAR_ATTRIBUTE_DIR_TAGTYPE_ELT, value);
    }

    @objid ("baa6fc11-dcd8-4724-97f0-f0529517f3ed")
    protected VarAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("50555086-8444-4a66-b218-389fd89b7fd9")
    public static final class MdaTypes {
        @objid ("d01985a5-de02-4920-9e45-e83e53b4110a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a01be17-c328-4454-91dd-279c4e1d2528")
        public static TagType VAR_ATTRIBUTE_DIR_TAGTYPE_ELT;

        @objid ("939e5190-6986-422a-b236-a05a6b0bdf54")
        private static Stereotype MDAASSOCDEP;

        @objid ("228dcbd7-eb06-48d4-ba44-f0fdd85bd700")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6d1a924-100d-4d34-b20c-afe395c28aef")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03dcf105-0ccf-11df-8525-001302895b2b");
            VAR_ATTRIBUTE_DIR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03dcf108-0ccf-11df-8525-001302895b2b");
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
