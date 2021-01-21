/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << InterruptResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a1609ea5-18cf-4ef8-98f3-b8d120effe88")
public class InterruptResourceInstance extends SwConcurrentResourceInstance {
    @objid ("7b0f54d9-83cf-4060-b15e-defba01d2233")
    public static final String STEREOTYPE_NAME = "InterruptResource_Instance";

    @objid ("dd9475f7-8d1b-4058-bef3-b410bda511eb")
    public static final String INTERRUPTRESOURCE_INSTANCE_ISMASKABLE_TAGTYPE = "InterruptResource_Instance_isMaskable";

    @objid ("8551f4aa-427e-43d7-a7d5-e82f5941d887")
    public static final String INTERRUPTRESOURCE_INSTANCE_KIND_TAGTYPE = "InterruptResource_Instance_kind";

    @objid ("162323cc-c8ee-4bb5-9e85-fb25819b72c1")
    public static final String INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE = "InterruptResource_Instance_maskElements";

    @objid ("8a98fdb6-3fff-41e4-9001-fdb65cf334b3")
    public static final String INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Instance_routineConnectServices";

    @objid ("2f0ca7e9-b454-4f8d-b616-98315223bee5")
    public static final String INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Instance_routineDisconnectServices";

    @objid ("c02363b1-cb6e-40a8-bfe9-cae195444d9d")
    public static final String INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS_TAGTYPE = "InterruptResource_Instance_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << InterruptResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("26cf9751-640d-4855-b54c-8a4cb45e4e73")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << InterruptResource_Instance >> then instantiate a {@link InterruptResourceInstance} proxy.
     * 
     * @return a {@link InterruptResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("18279093-913c-4503-9680-31c5c854bcf2")
    public static InterruptResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceInstance.STEREOTYPE_NAME);
        return InterruptResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceInstance} proxy from a {@link Instance} stereotyped << InterruptResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link InterruptResourceInstance} proxy or <i>null</i>.
     */
    @objid ("fe1b9d04-799f-4611-a5d8-33bd2eddf236")
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
    @objid ("95495adb-5825-4b22-8ff2-cf0ff8809b88")
    public static InterruptResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (InterruptResourceInstance.canInstantiate(obj))
        	return new InterruptResourceInstance(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("56739539-5c41-4705-9049-a9baaaaf00c4")
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
    @objid ("12bd93eb-5f98-452a-ab8b-d4824477f2d9")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Instance_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5053169e-adc0-4d7e-a00b-a1cf24121ba0")
    public String getInterruptResource_Instance_kind() {
        return this.elt.getTagValue(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Instance_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("10254709-e682-4cca-b607-96688d091343")
    public List<String> getInterruptResource_Instance_maskElements() {
        return this.elt.getTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Instance_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f87fb9d6-b510-4d90-b999-2a416c6085de")
    public List<String> getInterruptResource_Instance_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Instance_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2c7b2de9-2f62-409f-81f2-c49f9d233613")
    public List<String> getInterruptResource_Instance_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Instance_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("18db350f-7ea6-498c-a48d-ef780b7ddd84")
    public List<String> getInterruptResource_Instance_vectorElements() {
        return this.elt.getTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @objid ("e3a8c060-6f7a-4983-b746-4dbc70977aaf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Instance_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6cd32c98-609d-4132-bdf3-31cb6432e46a")
    public boolean isInterruptResource_Instance_isMaskable() {
        return this.elt.isTagged(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Instance_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2938780-201a-4449-8ed3-de8e3e82b4b4")
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
    @objid ("af097a35-3abd-4564-9272-fe58db89b084")
    public void setInterruptResource_Instance_kind(final String value) {
        this.elt.putTagValue(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Instance_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24560f98-d6b7-4a75-964b-6dab0b144190")
    public void setInterruptResource_Instance_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Instance_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c78361fe-0b32-4029-8a50-c98294746235")
    public void setInterruptResource_Instance_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Instance_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("979c7303-eb81-4ffe-88b7-63b2472417f1")
    public void setInterruptResource_Instance_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Instance_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef7daeca-4618-4f0a-ac60-0c2a6ebf08c8")
    public void setInterruptResource_Instance_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceInstance.MdaTypes.INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("9713d10c-a75a-4db5-8da2-fed02e2e1da8")
    protected InterruptResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f0ef8932-65bc-4a1e-8bc6-d66c6664e04a")
    public static final class MdaTypes {
        @objid ("ea9fc7cc-957c-4cba-9bdd-c638826f4d90")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("747e8c19-f46a-4cf5-b57f-d0f5ea0f8881")
        public static TagType INTERRUPTRESOURCE_INSTANCE_KIND_TAGTYPE_ELT;

        @objid ("672c77d1-3252-4d4a-a86e-deaab9eda87b")
        public static TagType INTERRUPTRESOURCE_INSTANCE_ISMASKABLE_TAGTYPE_ELT;

        @objid ("f2a2c927-4753-4e79-9507-1bcb810cb586")
        public static TagType INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS_TAGTYPE_ELT;

        @objid ("41693954-3784-4833-9e38-f93374eb90f1")
        public static TagType INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("42a8dac9-b119-4ba8-905f-ffdd25c1bad1")
        public static TagType INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        @objid ("251524a2-0fdc-49e9-870d-a8cf79b40088")
        public static TagType INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        @objid ("4f008857-57ff-4ff2-be5c-c33f52566ee5")
        private static Stereotype MDAASSOCDEP;

        @objid ("01e3ed88-0f9f-42f1-acca-90cf2513b3fb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6679c2bb-66ba-4f19-8b27-32a1ba285fb9")
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
