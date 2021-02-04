/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("30013212-6a6f-4626-b6eb-20ce8970b8fb")
    public static final String STEREOTYPE_NAME = "SchedulableResource_Instance";

    @objid ("257c1542-4b3a-416a-ae03-9b47e460b8a4")
    public static final String SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Instance_dependentScheduler";

    @objid ("ff9985df-591c-4af3-8794-9fbb347429e9")
    public static final String SCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE = "SchedulableResource_Instance_host";

    @objid ("a166ef5e-933b-4257-96f5-3a360271e2f6")
    public static final String SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Instance_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SchedulableResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("61938e34-ad4c-43e9-a496-9c7edb12129e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SchedulableResource_Instance >> then instantiate a {@link SchedulableResourceInstance} proxy.
     * 
     * @return a {@link SchedulableResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("4d837144-9df1-4401-bbdf-f3803364d06b")
    public static SchedulableResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceInstance.STEREOTYPE_NAME);
        return SchedulableResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceInstance} proxy from a {@link Instance} stereotyped << SchedulableResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SchedulableResourceInstance} proxy or <i>null</i>.
     */
    @objid ("e3f8e1e9-c57a-4df5-a248-17be7f79c470")
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
    @objid ("d427635e-7590-48ab-8b6b-1c7692fa7505")
    public static SchedulableResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SchedulableResourceInstance.canInstantiate(obj))
        	return new SchedulableResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ffd29869-c240-400b-bbaa-904e28fab90a")
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
    @objid ("2c55609b-3511-4ffa-88dc-c7cad60412e2")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02472581-f516-41b7-ba59-a1e9758c6c26")
    public String getSchedulableResource_Instance_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c467b4e-942a-4f9c-a0f8-c6f00d657e22")
    public String getSchedulableResource_Instance_host() {
        return this.elt.getTagValue(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Instance_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("76047d50-4219-4326-992c-0dac114ede42")
    public List<String> getSchedulableResource_Instance_schedParams() {
        return this.elt.getTagValues(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("c9d70fa5-cd60-4e8d-a504-3276d8fd1eb4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Instance_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40f4a974-6ff5-4aa2-8795-51c0cce6b000")
    public void setSchedulableResource_Instance_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Instance_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f683284-ea7b-4e67-ae17-93bd8ff03e51")
    public void setSchedulableResource_Instance_host(final String value) {
        this.elt.putTagValue(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Instance_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("11ee7c39-e79f-4cb5-bd21-3ba96c5fdc3f")
    public void setSchedulableResource_Instance_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceInstance.MdaTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("e1a89485-67d0-4212-8635-86e7a7674e32")
    protected SchedulableResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("03df60a8-b954-4986-a5c9-e0ba338d67aa")
    public static final class MdaTypes {
        @objid ("f110e7b3-db48-4ce4-ba19-863fa52a0820")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6bb56761-1a9d-495f-b6d2-520474b2367d")
        public static TagType SCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("a1721dfe-3797-4ea5-9270-a9cea5adb2c8")
        public static TagType SCHEDULABLERESOURCE_INSTANCE_HOST_TAGTYPE_ELT;

        @objid ("de161b20-0257-499f-8c54-effc2f1178e3")
        public static TagType SCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("a285ecb7-47ad-4625-8531-b0eb3c73ed7b")
        private static Stereotype MDAASSOCDEP;

        @objid ("d7634758-2835-457e-9344-3ed150de6ab7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e1ef6d7d-d71c-4435-8820-070ebe32d512")
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
