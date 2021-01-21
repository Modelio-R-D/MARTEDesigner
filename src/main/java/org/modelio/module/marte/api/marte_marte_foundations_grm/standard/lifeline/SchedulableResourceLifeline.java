/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SchedulableResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6ed82404-a091-4004-acd4-8a9a55fd4a97")
public class SchedulableResourceLifeline extends ResourceLifeline {
    @objid ("39ae7d42-97b9-4863-b2ca-942be32f46c1")
    public static final String STEREOTYPE_NAME = "SchedulableResource_Lifeline";

    @objid ("f1268c5d-418e-4f62-9733-d19101e35e49")
    public static final String SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Lifeline_dependentScheduler";

    @objid ("12674d5b-706c-4ca9-9f44-ded5750aacef")
    public static final String SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE = "SchedulableResource_Lifeline_host";

    @objid ("ec4adb8d-f2a6-4675-a04f-56cc8ba2f472")
    public static final String SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Lifeline_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SchedulableResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f06a0296-85dd-4228-a4eb-93b1f8fa32b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SchedulableResource_Lifeline >> then instantiate a {@link SchedulableResourceLifeline} proxy.
     * 
     * @return a {@link SchedulableResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("88cd3dd1-75ae-49d6-8880-268fe7b1e06a")
    public static SchedulableResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceLifeline.STEREOTYPE_NAME);
        return SchedulableResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceLifeline} proxy from a {@link Lifeline} stereotyped << SchedulableResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SchedulableResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("ac77477f-ee8a-42b8-9024-39b31f5a76df")
    public static SchedulableResourceLifeline instantiate(final Lifeline obj) {
        return SchedulableResourceLifeline.canInstantiate(obj) ? new SchedulableResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceLifeline} proxy from a {@link Lifeline} stereotyped << SchedulableResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SchedulableResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a0aea68c-5248-4db9-928f-427b0bb682c1")
    public static SchedulableResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SchedulableResourceLifeline.canInstantiate(obj))
        	return new SchedulableResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1e5f1677-728e-4aa4-a5d9-31a45e3c02ab")
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
        SchedulableResourceLifeline other = (SchedulableResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("96bec8de-a9fb-4697-a00d-e56c7e9686fe")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Lifeline_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6e98bf6-7ee1-4900-867f-b493070c5938")
    public String getSchedulableResource_Lifeline_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ed55a974-50a6-4e88-9925-2c2b66501281")
    public String getSchedulableResource_Lifeline_host() {
        return this.elt.getTagValue(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Lifeline_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("42ac9b4f-a003-43de-8f60-a2a4c2c0b026")
    public List<String> getSchedulableResource_Lifeline_schedParams() {
        return this.elt.getTagValues(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("6a589398-c0bc-46fc-9f91-cd538274bcaf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Lifeline_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c99df66-9ef5-46ff-8702-f49ad2d39b29")
    public void setSchedulableResource_Lifeline_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Lifeline_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5d2c9b3-c19b-4b11-a41c-8fc68b5f5658")
    public void setSchedulableResource_Lifeline_host(final String value) {
        this.elt.putTagValue(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Lifeline_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75b1f44e-da08-45cf-9c34-11d4065ca8d0")
    public void setSchedulableResource_Lifeline_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceLifeline.MdaTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("17d087ef-550a-4a31-9ada-e13b61e96667")
    protected SchedulableResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("ee95d36f-669e-4a6b-82da-d8161ee1d4e0")
    public static final class MdaTypes {
        @objid ("534b4c16-14ec-488b-8152-ce4e74f222ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("487eb196-26d3-4f64-9694-86d4e02c5e9d")
        public static TagType SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("17b2a20e-aef8-4130-8077-2761d9d249dc")
        public static TagType SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT;

        @objid ("f16bcb57-e04d-43ef-910d-ac26b43df539")
        public static TagType SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("d2442113-d7e9-4906-a3f5-14b3f68b4476")
        private static Stereotype MDAASSOCDEP;

        @objid ("b535db60-97a3-49aa-b06f-76e73eec1442")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("285bf175-71dd-4e56-9907-67f7509f8df9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1bf9e3bc-0f4e-11df-8c52-0014222a9f79");
            SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "523fb91e-14c6-11df-92f7-001302895b2b");
            SCHEDULABLERESOURCE_LIFELINE_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "57c7f73a-14c6-11df-92f7-001302895b2b");
            SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5d4dd2f8-14c6-11df-92f7-001302895b2b");
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
