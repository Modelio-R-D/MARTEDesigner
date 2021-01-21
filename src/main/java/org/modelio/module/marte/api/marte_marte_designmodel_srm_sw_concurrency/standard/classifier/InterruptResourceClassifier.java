/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << InterruptResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("07079a37-6bd4-4d06-8e6c-cc9b1b47b92e")
public class InterruptResourceClassifier extends SwConcurrentResourceClassifier {
    @objid ("22c7bc7b-fa02-4526-beb0-3507dbf00a64")
    public static final String STEREOTYPE_NAME = "InterruptResource_Classifier";

    @objid ("02a93810-56c3-4ff1-ac92-a94827c3ac3d")
    public static final String INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE = "InterruptResource_Classifier_isMaskable";

    @objid ("f1ab85fe-8093-4c75-9cb2-0dd31b5c673c")
    public static final String INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE = "InterruptResource_Classifier_kind";

    @objid ("6d02bcd0-b07f-49b3-8148-cd24ea9b6ea1")
    public static final String INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE = "InterruptResource_Classifier_maskElements";

    @objid ("63aa423e-3af9-4002-8cbe-27c8ec6bff94")
    public static final String INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Classifier_routineConnectServices";

    @objid ("e82d01bf-72d6-48a2-a8b6-6bf782a65e73")
    public static final String INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Classifier_routineDisconnectServices";

    @objid ("ce1a2882-67d8-42f0-91fb-6baa01461ecf")
    public static final String INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE = "InterruptResource_Classifier_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << InterruptResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("810c6e7f-93d6-4b43-89f3-57656c0a9938")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << InterruptResource_Classifier >> then instantiate a {@link InterruptResourceClassifier} proxy.
     * 
     * @return a {@link InterruptResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("ab696ea5-e6f2-4df8-9d12-8e587cc40c52")
    public static InterruptResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceClassifier.STEREOTYPE_NAME);
        return InterruptResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceClassifier} proxy from a {@link Classifier} stereotyped << InterruptResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link InterruptResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("00f8a60b-47b7-4de6-8eff-05b717fbcdee")
    public static InterruptResourceClassifier instantiate(final Classifier obj) {
        return InterruptResourceClassifier.canInstantiate(obj) ? new InterruptResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceClassifier} proxy from a {@link Classifier} stereotyped << InterruptResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link InterruptResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f91493bd-0a66-4e0b-9b32-e36bdb2753ce")
    public static InterruptResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (InterruptResourceClassifier.canInstantiate(obj))
        	return new InterruptResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0e3e578a-f98e-4936-aa8d-d1326bb531f3")
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
        InterruptResourceClassifier other = (InterruptResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("2c7388fd-b0ca-4d17-a777-3fdcf221c54c")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Classifier_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1130082-b303-4f3e-be2a-a005ca307dec")
    public String getInterruptResource_Classifier_kind() {
        return this.elt.getTagValue(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Classifier_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7a69b4df-fc73-46b1-8f8b-c4a1d690194f")
    public List<String> getInterruptResource_Classifier_maskElements() {
        return this.elt.getTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Classifier_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0b11e4a0-f844-44bf-a220-7a4537f1c7ec")
    public List<String> getInterruptResource_Classifier_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Classifier_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7e59f491-7919-4fb3-8294-4a9d1431e6ca")
    public List<String> getInterruptResource_Classifier_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Classifier_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("34f02e85-1459-43c6-bd2b-469a4d9b5f89")
    public List<String> getInterruptResource_Classifier_vectorElements() {
        return this.elt.getTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @objid ("0b5815d0-c1c3-47f3-9c64-5dead75608f6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Classifier_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a95bf6b-c855-4313-872f-2ef8f02aa332")
    public boolean isInterruptResource_Classifier_isMaskable() {
        return this.elt.isTagged(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Classifier_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9084b26b-8775-4751-a3c1-f3e76cb9d06a")
    public void setInterruptResource_Classifier_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Classifier_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0fb44f9b-a3b6-4bec-836f-7920ebce4c47")
    public void setInterruptResource_Classifier_kind(final String value) {
        this.elt.putTagValue(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Classifier_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42f4e2b3-c0d1-469a-adfd-e7721526679c")
    public void setInterruptResource_Classifier_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Classifier_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d17b2600-b2de-4a01-a10d-4b567abbc19f")
    public void setInterruptResource_Classifier_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Classifier_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a54284f3-1d9f-4451-95e4-c19966c39493")
    public void setInterruptResource_Classifier_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Classifier_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4828a1f0-2ab9-4f40-b1fb-777cedec2a50")
    public void setInterruptResource_Classifier_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceClassifier.MdaTypes.INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("2f2a9029-89d2-4b2f-8cf3-9f8c3ad464c5")
    protected InterruptResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("9c97e749-9f69-4919-889e-31b3bbca7993")
    public static final class MdaTypes {
        @objid ("4dc5ad9c-2a37-48d8-a452-ff7ce9d38de0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bdda08e2-18d1-4651-a4c7-117887e08a6d")
        public static TagType INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE_ELT;

        @objid ("70ab0b9e-26ee-4864-8571-8e731106ff52")
        public static TagType INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT;

        @objid ("afccd9fd-4d99-4c6d-ace5-c982a8b8585d")
        public static TagType INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE_ELT;

        @objid ("886a3812-806a-48a0-8680-167ec65e21b3")
        public static TagType INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("643750ad-5aa1-42d3-a6eb-148e448acc32")
        public static TagType INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        @objid ("4d1707b2-1ac3-4192-b576-cfeb9492a2d8")
        public static TagType INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        @objid ("ad391c80-ae15-46e1-bd4a-8e2bb73936aa")
        private static Stereotype MDAASSOCDEP;

        @objid ("f536b21d-5d48-4f07-a761-fdb1101a1595")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4fa0806-adc5-4649-9df6-00c06938d903")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cbe02c27-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c28-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c29-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c2a-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c2b-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c2c-10d0-11df-81d9-0014222a9f79");
            INTERRUPTRESOURCE_CLASSIFIER_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbe02c2d-10d0-11df-81d9-0014222a9f79");
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
