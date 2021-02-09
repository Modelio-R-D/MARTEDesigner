/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.instance;

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
public class PaLogicalResourceInstance {
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Instance";

    public static final String PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE = "PaLogicalResource_Instance_poolSize";

    public static final String PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE = "PaLogicalResource_Instance_throughput";

    public static final String PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE = "PaLogicalResource_Instance_utilization";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    protected final Instance elt;

    /**
     * Tells whether a {@link PaLogicalResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << PaLogicalResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << PaLogicalResource_Instance >> then instantiate a {@link PaLogicalResourceInstance} proxy.
     * 
     * @return a {@link PaLogicalResourceInstance} proxy on the created {@link Instance}.
     */
    public static PaLogicalResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceInstance.STEREOTYPE_NAME);
        return PaLogicalResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceInstance} proxy from a {@link Instance} stereotyped << PaLogicalResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link PaLogicalResourceInstance} proxy or <i>null</i>.
     */
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
    public static PaLogicalResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (PaLogicalResourceInstance.canInstantiate(obj))
        	return new PaLogicalResourceInstance(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PaLogicalResourceInstance other = (PaLogicalResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PaLogicalResource_Instance_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_Instance_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_Instance_throughput() {
        return this.elt.getTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_Instance_utilization() {
        return this.elt.getTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Instance_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_Instance_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_Instance_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_Instance_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT, value);
    }

    protected PaLogicalResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT;

        public static TagType PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT;

        public static TagType PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
