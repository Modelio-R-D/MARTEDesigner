/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Instance} with << SchedulableResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("99562fa5-5b41-42cc-8629-5482fa85efb8")
public class SchedulableResourceInstance extends ResourceInstance {
    @objid ("ed985cc4-bb54-4bb9-b638-9902d002e8e7")
    public static final String STEREOTYPE_NAME = "SchedulableResource_Instance";

    @objid ("b222bd03-64b7-429c-9128-78edbcbf3e1d")
    public static final String SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Instance_dependentScheduler";

    @objid ("d3f17678-9d84-4d9b-9942-8542e49e7577")
    public static final String SCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE = "SchedulableResource_Instance_host";

    @objid ("e75e6d82-b681-4c83-a20a-b0ef2c76ebc5")
    public static final String SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Instance_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SchedulableResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0019a838-f990-4c56-8cc3-fd4be8a1ef75")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SchedulableResource_Instance >> then instantiate a {@link SchedulableResourceInstance} proxy.
     * 
     * @return a {@link SchedulableResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("caf79712-46bc-43c8-a97c-81af4a1442d6")
    public static SchedulableResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceInstance.STEREOTYPE_NAME);
        return SchedulableResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceInstance} proxy from a {@link Instance} stereotyped << SchedulableResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SchedulableResourceInstance} proxy or <i>null</i>.
     */
    @objid ("b7d6f557-495c-4b71-9743-d037bcaca988")
    public static SchedulableResourceInstance instantiate(final Instance obj) {
        return SchedulableResourceInstance.canInstantiate(obj) ? new SchedulableResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceInstance} proxy from a {@link Instance} stereotyped << SchedulableResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SchedulableResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2ff4c62c-415a-44ab-8dd2-f5c3c4e9c660")
    public static SchedulableResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SchedulableResourceInstance.canInstantiate(obj))
        	return new SchedulableResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("87f891f3-0b37-4970-9485-3e3faeaee139")
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
        SchedulableResourceInstance other = (SchedulableResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("c091812d-96ae-440d-97d3-2977064c9bf9")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fea67b16-5339-4b99-8ea8-e6c3ddadf7f8")
    public String getSchedulableResource_Instance_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1348d26b-281f-442a-a492-2160b67fa875")
    public String getSchedulableResource_Instance_host() {
        return this.elt.getTagValue(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Instance_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("94ee547b-ec93-43b3-87ff-e2f60670ae88")
    public List<String> getSchedulableResource_Instance_schedParams() {
        return this.elt.getTagValues(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("74410ff3-654a-41e0-8285-e907191aad6b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("73afbf24-73d0-44e2-85c4-c4132e028eb9")
    public void setSchedulableResource_Instance_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("776d530a-3bdc-4980-8e11-a3455ad5ee3a")
    public void setSchedulableResource_Instance_host(final String value) {
        this.elt.putTagValue(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Instance_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("067e794b-ea36-4fb8-b697-6a7a3c584945")
    public void setSchedulableResource_Instance_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("97c06fac-ab19-4c11-b98a-e529dbfba475")
    protected SchedulableResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("03df60a8-b954-4986-a5c9-e0ba338d67aa")
    public static final class MdaTypes {
        @objid ("34e0af21-bd2e-4f73-83b8-0f10592cba67")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("017c0db8-92f8-45d5-9787-1e1308ba9738")
        public static TagType SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("84736833-9e50-46b4-9213-09eed09edb51")
        public static TagType SCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT;

        @objid ("79c1e8d8-df75-42af-b2bf-503ed742017f")
        public static TagType SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("79441aa0-4afd-4516-837f-f8dc2ae59e2b")
        private static Stereotype MDAASSOCDEP;

        @objid ("a1f75320-eb33-4873-8c21-44342befea90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("750dc790-1eba-4b74-8595-a7c0baa3dc8c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "008e9939-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb8a-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb91-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb98-0ccf-11df-8525-001302895b2b");
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
