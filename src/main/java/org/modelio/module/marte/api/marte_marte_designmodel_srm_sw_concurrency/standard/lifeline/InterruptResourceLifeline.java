/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

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
 * Proxy class to handle a {@link Lifeline} with << InterruptResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("70d36704-2ce6-4dc6-adb6-e1709cf2aab7")
public class InterruptResourceLifeline extends SwConcurrentResourceLifeline {
    @objid ("605f92d1-93b3-4ae7-bd55-93fd6de5aa09")
    public static final String STEREOTYPE_NAME = "InterruptResource_Lifeline";

    @objid ("1e51b0e2-abf8-4af9-8b17-d4afbf599a46")
    public static final String INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE = "InterruptResource_Lifeline_isMaskable";

    @objid ("9bea5a5b-809e-475f-b148-9d1e6f071924")
    public static final String INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE = "InterruptResource_Lifeline_kind";

    @objid ("b1347913-3104-4aa9-948f-c4c6d997f850")
    public static final String INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE = "InterruptResource_Lifeline_maskElements";

    @objid ("eea7aafc-af21-40b8-8b5b-64bc5b27e894")
    public static final String INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Lifeline_routineConnectServices";

    @objid ("bc85b187-8fce-4ebb-b677-8cf6f31b4c18")
    public static final String INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Lifeline_routineDisconnectServices";

    @objid ("126a6b16-cd92-42c9-a190-1999549e8de9")
    public static final String INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE = "InterruptResource_Lifeline_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << InterruptResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0b719d1f-b625-4cd2-b2a2-9a5a2c5656f2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << InterruptResource_Lifeline >> then instantiate a {@link InterruptResourceLifeline} proxy.
     * 
     * @return a {@link InterruptResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("4c791796-8afe-4bcb-91d4-db0b5449cd8e")
    public static InterruptResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceLifeline.STEREOTYPE_NAME);
        return InterruptResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceLifeline} proxy from a {@link Lifeline} stereotyped << InterruptResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link InterruptResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("101f5cd4-6ebc-47de-9f95-f39427f422dc")
    public static InterruptResourceLifeline instantiate(final Lifeline obj) {
        return InterruptResourceLifeline.canInstantiate(obj) ? new InterruptResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceLifeline} proxy from a {@link Lifeline} stereotyped << InterruptResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link InterruptResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("819523e6-341a-42e3-821e-459b884e71d0")
    public static InterruptResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (InterruptResourceLifeline.canInstantiate(obj))
        	return new InterruptResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e36cfe84-df9a-4651-8e58-eeb003aef068")
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
        InterruptResourceLifeline other = (InterruptResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("e746e4af-4ec0-436e-a503-bdcfeec44519")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Lifeline_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6087b49-78ea-47cb-88fd-6dc8684e8588")
    public String getInterruptResource_Lifeline_kind() {
        return this.elt.getTagValue(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Lifeline_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6fa7a177-e469-4832-991d-990eec175f1b")
    public List<String> getInterruptResource_Lifeline_maskElements() {
        return this.elt.getTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Lifeline_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("70431de8-2b76-4bd3-b6ee-1af54bd665b9")
    public List<String> getInterruptResource_Lifeline_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Lifeline_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bd7fc5fd-ad53-48fc-b027-5ed64252faa1")
    public List<String> getInterruptResource_Lifeline_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Lifeline_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("30635676-59ab-46ed-bac6-d45bc79b2a31")
    public List<String> getInterruptResource_Lifeline_vectorElements() {
        return this.elt.getTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @objid ("329a437e-a3d6-4573-8676-b84d691e2ec9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Lifeline_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("750020d7-f3a5-4f21-8fcc-62cb4484b955")
    public boolean isInterruptResource_Lifeline_isMaskable() {
        return this.elt.isTagged(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Lifeline_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1054f87-9e69-4e51-a169-507786656de1")
    public void setInterruptResource_Lifeline_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Lifeline_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d2bfd6a8-1ffe-44c8-a269-5b2698f9cdac")
    public void setInterruptResource_Lifeline_kind(final String value) {
        this.elt.putTagValue(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Lifeline_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1becb2d1-c643-4118-8af8-6392c78cb91f")
    public void setInterruptResource_Lifeline_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Lifeline_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("addb6601-79d8-4db8-b553-223a978497f8")
    public void setInterruptResource_Lifeline_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Lifeline_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7369a54b-e205-4575-8741-05a2a2383090")
    public void setInterruptResource_Lifeline_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Lifeline_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("426026cd-5438-4480-9997-d60ca56927d7")
    public void setInterruptResource_Lifeline_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceLifeline.MdaTypes.INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("a01d7dcd-9125-4a5c-b2ad-566b005a72ae")
    protected InterruptResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("2346f4a5-a049-44e7-9d1a-774dbaef7254")
    public static final class MdaTypes {
        @objid ("f1b5abd7-1ba0-4fe5-874a-ceba746e949b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f230c8b1-69e7-40f1-8639-a5bb30ab5932")
        public static TagType INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE_ELT;

        @objid ("e52e34c4-323b-46fb-96ae-3fa9e52a4abc")
        public static TagType INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT;

        @objid ("cee9a039-d11b-4360-8f4f-007c39cca14e")
        public static TagType INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE_ELT;

        @objid ("311d00a2-da58-4ff1-88c8-c6b43a75e829")
        public static TagType INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("7b4cdde0-4218-4d7b-9ad5-e88a7a065188")
        public static TagType INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        @objid ("03a01079-6fd1-483b-b7ed-aa92ab9d173b")
        public static TagType INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        @objid ("83404faf-64bd-47d2-b695-532cfb3ebc3d")
        private static Stereotype MDAASSOCDEP;

        @objid ("011d9d3b-c92b-4445-aea5-6633626d93ec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb9d415b-b593-4285-9793-7a535ef039bc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cbbc68b4-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b5-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b6-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b7-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b8-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68b9-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_LIFELINE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbbc68ba-10d0-11df-81d9-0014222a9f79");
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
