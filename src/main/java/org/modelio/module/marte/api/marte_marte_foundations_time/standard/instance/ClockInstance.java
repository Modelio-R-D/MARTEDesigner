/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << Clock_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("550564a6-8f33-4c46-9bd7-990c8f6bd1c5")
public class ClockInstance {
    @objid ("3a5aa147-fd76-47da-985d-bbfbac14353f")
    public static final String STEREOTYPE_NAME = "Clock_Instance";

    @objid ("8d9bf666-6b97-44fd-8a2f-1befc16a457f")
    public static final String CLOCK_INSTANCE_STANDARD_TAGTYPE = "Clock_Instance_standard";

    @objid ("55974922-202d-4168-8f7d-c60a992db942")
    public static final String CLOCK_INSTANCE_TYPE_TAGTYPE = "Clock_Instance_type";

    @objid ("aac6f93b-4ba0-4a89-bb51-49033499d1b0")
    public static final String CLOCK_INSTANCE_UNIT_TAGTYPE = "Clock_Instance_unit";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    @objid ("4ef5c330-f324-4061-a6b2-f0059eb22155")
    protected final Instance elt;

    /**
     * Tells whether a {@link ClockInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Clock_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4035369e-c35d-4500-b84c-b1f62e3b138a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Clock_Instance >> then instantiate a {@link ClockInstance} proxy.
     * 
     * @return a {@link ClockInstance} proxy on the created {@link Instance}.
     */
    @objid ("0f7d1e07-1135-4741-9f16-e1c6a61f881d")
    public static ClockInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockInstance.STEREOTYPE_NAME);
        return ClockInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ClockInstance} proxy from a {@link Instance} stereotyped << Clock_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ClockInstance} proxy or <i>null</i>.
     */
    @objid ("de2b00c9-f3c5-4044-b9c3-57a6049d7ea6")
    public static ClockInstance instantiate(final Instance obj) {
        return ClockInstance.canInstantiate(obj) ? new ClockInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockInstance} proxy from a {@link Instance} stereotyped << Clock_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ClockInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d9ee6b26-c098-4d56-9ebc-7bf0943f7184")
    public static ClockInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ClockInstance.canInstantiate(obj))
        	return new ClockInstance(obj);
        else
        	throw new IllegalArgumentException("ClockInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d663c9f3-e831-4e11-b38a-32df0cb558ed")
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
        ClockInstance other = (ClockInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_Instance_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("486d9398-e72d-42b2-bb5d-4f36286c1e58")
    public String getClock_Instance_standard() {
        return this.elt.getTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4f493275-cd91-48cc-8349-663eb3a8daf1")
    public String getClock_Instance_type() {
        return this.elt.getTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Instance_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1da5b06-dfa6-41d8-a91e-f104169b042a")
    public String getClock_Instance_unit() {
        return this.elt.getTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("4c37fc72-e1ba-444b-b854-ba8c7436c1f3")
    public Instance getElement() {
        return this.elt;
    }

    @objid ("42f95b7e-aee2-49df-8d16-a9b86090631a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Instance_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21cd40eb-9704-44e6-81e9-dca3673c0d22")
    public void setClock_Instance_standard(final String value) {
        this.elt.putTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Instance_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("576a1946-9768-433f-88d4-b832c7d005ba")
    public void setClock_Instance_type(final String value) {
        this.elt.putTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Instance_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("edcf21c1-3251-4048-a9f3-0f25a59f8b94")
    public void setClock_Instance_unit(final String value) {
        this.elt.putTagValue(ClockInstance.MdaTypes.CLOCK_INSTANCE_UNIT_TAGTYPE_ELT, value);
    }

    @objid ("d1d69ea1-0ad2-4828-a126-fcb67a00f012")
    protected ClockInstance(final Instance elt) {
        this.elt = elt;
    }

    @objid ("1178685a-7311-41d8-b5b7-938242e9d416")
    public static final class MdaTypes {
        @objid ("769b956a-2cdb-4932-92de-4088a19f8672")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0384bd9a-59c8-466d-abec-ed2f744240a0")
        public static TagType CLOCK_INSTANCE_STANDARD_TAGTYPE_ELT;

        @objid ("6a065eaf-26e9-49dc-80b0-38d49d9517e4")
        public static TagType CLOCK_INSTANCE_TYPE_TAGTYPE_ELT;

        @objid ("b1f85c63-997d-402d-bed4-db7846b11e10")
        public static TagType CLOCK_INSTANCE_UNIT_TAGTYPE_ELT;

        @objid ("8aab203a-7bc0-4c25-a5bc-0ef20aa67064")
        private static Stereotype MDAASSOCDEP;

        @objid ("89926011-b86b-43f8-ac6d-8b782e7345e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96e98f28-2cfb-4bff-857f-18dc4d46034e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "df95dcf2-14cd-11df-9d54-0014222a9f79");
            CLOCK_INSTANCE_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "df95dcf3-14cd-11df-9d54-0014222a9f79");
            CLOCK_INSTANCE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "df95dcf4-14cd-11df-9d54-0014222a9f79");
            CLOCK_INSTANCE_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "df95dcf5-14cd-11df-9d54-0014222a9f79");
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
