/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << PaLogicalResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b53cd6b4-0a4a-4403-a11e-11384a4822b0")
public class PaLogicalResourceInstance {
    @objid ("f9213d4a-7d33-46bc-8956-b457c33b9b3b")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Instance";

    @objid ("8bd35738-e3ec-4900-8902-b3f312e1df03")
    public static final String PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE = "PaLogicalResource_Instance_poolSize";

    @objid ("292dce1c-86b0-4509-b0bf-fd686c99a77f")
    public static final String PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE = "PaLogicalResource_Instance_throughput";

    @objid ("faad2972-f29f-4e34-889e-963d1068e021")
    public static final String PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE = "PaLogicalResource_Instance_utilization";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    @objid ("227327fa-041b-4338-b961-109bef49e368")
    protected final Instance elt;

    /**
     * Tells whether a {@link PaLogicalResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << PaLogicalResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fa3f5028-143e-483e-ab96-2f7c242404b0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << PaLogicalResource_Instance >> then instantiate a {@link PaLogicalResourceInstance} proxy.
     * 
     * @return a {@link PaLogicalResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("757a7411-d704-4407-99e7-f2f3a05d5731")
    public static PaLogicalResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceInstance.STEREOTYPE_NAME);
        return PaLogicalResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceInstance} proxy from a {@link Instance} stereotyped << PaLogicalResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link PaLogicalResourceInstance} proxy or <i>null</i>.
     */
    @objid ("ada9e75a-13b0-4f5b-9e46-b53da6de73ad")
    public static PaLogicalResourceInstance instantiate(final Instance obj) {
        return PaLogicalResourceInstance.canInstantiate(obj) ? new PaLogicalResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceInstance} proxy from a {@link Instance} stereotyped << PaLogicalResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link PaLogicalResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("59d9a0ac-2cca-40b6-81b0-e250782c46f5")
    public static PaLogicalResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (PaLogicalResourceInstance.canInstantiate(obj))
        	return new PaLogicalResourceInstance(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d28e188-7849-46ea-81e7-8ba674e5c66f")
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
        PaLogicalResourceInstance other = (PaLogicalResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("dbdd449b-28f4-4274-9f4b-54ba5c949db3")
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PaLogicalResource_Instance_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7631076c-9d57-4f28-b927-58c37bf21a1a")
    public String getPaLogicalResource_Instance_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e9ddbe3-4316-4711-8b30-9b881c70d70b")
    public String getPaLogicalResource_Instance_throughput() {
        return this.elt.getTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47c5d149-59c9-486c-a9f6-1ae9c48c9cce")
    public String getPaLogicalResource_Instance_utilization() {
        return this.elt.getTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("3649fbf5-1557-4976-bfea-dc64433c472b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Instance_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59ecbea5-ec9c-4f98-834d-34e7ffab8307")
    public void setPaLogicalResource_Instance_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6a62e99-b256-46ad-a3c7-474d836aa675")
    public void setPaLogicalResource_Instance_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b2805b04-18d3-4039-82d1-1f91774e69a0")
    public void setPaLogicalResource_Instance_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("81827625-f720-44d8-95d3-8c03f5729bfd")
    protected PaLogicalResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    @objid ("0ff2d012-001a-4ac0-8aac-e8ae5a6385ec")
    public static final class MdaTypes {
        @objid ("402cb49f-0e4a-4f2e-86de-d67c6304bbcd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cbc1530c-7d04-486c-978b-792919d86ee0")
        public static TagType PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT;

        @objid ("70345083-c936-4094-9dcc-36ea497ec0f5")
        public static TagType PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("9ff0d0f5-7086-4ecc-9f59-c1e3f30960da")
        public static TagType PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT;

        @objid ("7554180d-37eb-401c-a8eb-8537463814bc")
        private static Stereotype MDAASSOCDEP;

        @objid ("d962ee3e-4a5c-4a35-a1e5-3b706a2c0517")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("943d5031-857b-4c7f-8277-307d63964c1a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d10557-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d1055e-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367a4-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367ab-0ccf-11df-8525-001302895b2b");
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
