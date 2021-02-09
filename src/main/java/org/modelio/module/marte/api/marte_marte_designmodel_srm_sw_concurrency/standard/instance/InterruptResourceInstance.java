/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Instance} with << InterruptResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class InterruptResourceInstance extends SwConcurrentResourceInstance {
    public static final String STEREOTYPE_NAME = "InterruptResource_Instance";

    public static final String INTERRUPTRESOURCE_INSTANCE_ISMASKABLE_TAGTYPE = "InterruptResource_Instance_isMaskable";

    public static final String INTERRUPTRESOURCE_INSTANCE_KIND_TAGTYPE = "InterruptResource_Instance_kind";

    public static final String INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE = "InterruptResource_Instance_maskElements";

    public static final String INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Instance_routineConnectServices";

    public static final String INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Instance_routineDisconnectServices";

    public static final String INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS_TAGTYPE = "InterruptResource_Instance_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << InterruptResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << InterruptResource_Instance >> then instantiate a {@link InterruptResourceInstance} proxy.
     * 
     * @return a {@link InterruptResourceInstance} proxy on the created {@link Instance}.
     */
    public static InterruptResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceInstance.STEREOTYPE_NAME);
        return InterruptResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceInstance} proxy from a {@link Instance} stereotyped << InterruptResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link InterruptResourceInstance} proxy or <i>null</i>.
     */
    public static InterruptResourceInstance instantiate(final Instance obj) {
        return InterruptResourceInstance.canInstantiate(obj) ? new InterruptResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceInstance} proxy from a {@link Instance} stereotyped << InterruptResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link InterruptResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static InterruptResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (InterruptResourceInstance.canInstantiate(obj))
        	return new InterruptResourceInstance(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        InterruptResourceInstance other = (InterruptResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Instance_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getInterruptResource_Instance_kind() {
        return this.elt.getTagValue(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Instance_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Instance_maskElements() {
        return this.elt.getTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Instance_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Instance_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Instance_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Instance_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Instance_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Instance_vectorElements() {
        return this.elt.getTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Instance_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isInterruptResource_Instance_isMaskable() {
        return this.elt.isTagged(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Instance_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Instance_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Instance_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Instance_kind(final String value) {
        this.elt.putTagValue(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Instance_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Instance_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Instance_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Instance_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Instance_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Instance_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Instance_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Instance_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    protected InterruptResourceInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_INSTANCE_KIND_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_INSTANCE_ISMASKABLE_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01c94b81-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_INSTANCE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b88-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_INSTANCE_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b8f-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b96-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b9d-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01cbadcf-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01cbadd6-0ccf-11df-8525-001302895b2b");
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
