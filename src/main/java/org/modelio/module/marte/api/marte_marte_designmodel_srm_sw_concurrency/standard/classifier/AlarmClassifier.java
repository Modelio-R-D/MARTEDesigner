/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Classifier} with << Alarm_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("696632f1-fbe0-42a5-ae7b-bb8d699f94cc")
public class AlarmClassifier extends InterruptResourceClassifier {
    @objid ("9097cd72-6250-40bb-99b2-2f0cb0219046")
    public static final String STEREOTYPE_NAME = "Alarm_Classifier";

    @objid ("476142e1-a66a-4229-9e23-d1ec148b4999")
    public static final String ALARM_CLASSIFIER_ISWATCHDOG_TAGTYPE = "Alarm_Classifier_isWatchdog";

    @objid ("2eb38c49-0438-4e75-a61b-785861a975af")
    public static final String ALARM_CLASSIFIER_TIMERS_TAGTYPE = "Alarm_Classifier_timers";

    /**
     * Tells whether a {@link AlarmClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << Alarm_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cafb845d-ba6a-46fd-8c24-d011c5bf7b29")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << Alarm_Classifier >> then instantiate a {@link AlarmClassifier} proxy.
     * 
     * @return a {@link AlarmClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("62e1cf4f-42f4-4854-a8f4-a0e392c61163")
    public static AlarmClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmClassifier.STEREOTYPE_NAME);
        return AlarmClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link AlarmClassifier} proxy from a {@link Classifier} stereotyped << Alarm_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link AlarmClassifier} proxy or <i>null</i>.
     */
    @objid ("ac6b35a1-42a0-488b-aae3-df0dbd23b8ad")
    public static AlarmClassifier instantiate(final Classifier obj) {
        return AlarmClassifier.canInstantiate(obj) ? new AlarmClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmClassifier} proxy from a {@link Classifier} stereotyped << Alarm_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link AlarmClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8f43a29f-4e08-4793-8d12-fe07677bb81f")
    public static AlarmClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (AlarmClassifier.canInstantiate(obj))
        	return new AlarmClassifier(obj);
        else
        	throw new IllegalArgumentException("AlarmClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0a64ef74-7611-4706-af1e-fa81558fdbc8")
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
        AlarmClassifier other = (AlarmClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_Classifier_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("34514959-4ab6-4af5-aa35-f97981a308dc")
    public List<String> getAlarm_Classifier_timers() {
        return this.elt.getTagValues(AlarmClassifier.MdaTypes.ALARM_CLASSIFIER_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("00900264-69a1-49b1-acd3-516d261fb871")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("f8d7b3aa-dadf-46f9-899b-eca9219cd869")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Classifier_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86ab3571-e117-4251-8598-a5541b4bd743")
    public boolean isAlarm_Classifier_isWatchdog() {
        return this.elt.isTagged(AlarmClassifier.MdaTypes.ALARM_CLASSIFIER_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Classifier_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c91d6f0b-8596-4dc6-a6d5-c57ae0822671")
    public void setAlarm_Classifier_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmClassifier.MdaTypes.ALARM_CLASSIFIER_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmClassifier.MdaTypes.ALARM_CLASSIFIER_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_Classifier_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49571cc2-be2c-4e9e-8031-377f9baad240")
    public void setAlarm_Classifier_timers(final List<String> values) {
        this.elt.putTagValues(AlarmClassifier.MdaTypes.ALARM_CLASSIFIER_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("3440b02b-18fc-4457-92c5-a8b3db1c2667")
    protected AlarmClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("1f205612-4e6e-4dd1-b3e6-6e58dca14e4a")
    public static final class MdaTypes {
        @objid ("7d1bfce9-aca4-4c37-b67c-92c35dee4874")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("24efcdc9-4ae4-41fc-b32b-a41920a31bc1")
        public static TagType ALARM_CLASSIFIER_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("fd2ae47f-421a-4d7c-90e4-f3cf6b25a756")
        public static TagType ALARM_CLASSIFIER_TIMERS_TAGTYPE_ELT;

        @objid ("e035700c-4419-4b98-b9ff-d87c065e070b")
        private static Stereotype MDAASSOCDEP;

        @objid ("e7ed2354-e033-4728-82c9-ad6a18a2e724")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("74284e08-7741-4cd7-8b18-84b89107ec9a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "019f92a6-10d1-11df-81d9-0014222a9f79");
            ALARM_CLASSIFIER_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019f92a7-10d1-11df-81d9-0014222a9f79");
            ALARM_CLASSIFIER_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019f92a8-10d1-11df-81d9-0014222a9f79");
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
