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
 * Proxy class to handle a {@link Classifier} with << Alarm_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("696632f1-fbe0-42a5-ae7b-bb8d699f94cc")
public class AlarmClassifier extends InterruptResourceClassifier {
    @objid ("c17c958c-26b4-4ba0-9094-5acca7421c91")
    public static final String STEREOTYPE_NAME = "Alarm_Classifier";

    @objid ("0220c1fb-2639-49c8-a806-c7b5a79cfb35")
    public static final String ALARM_CLASSIFIER_ISWATCHDOG_TAGTYPE = "Alarm_Classifier_isWatchdog";

    @objid ("a3447562-7212-4432-abe4-763470d0f74c")
    public static final String ALARM_CLASSIFIER_TIMERS_TAGTYPE = "Alarm_Classifier_timers";

    /**
     * Tells whether a {@link AlarmClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << Alarm_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2fd26a93-b43b-439b-8e91-329df08e7c3c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << Alarm_Classifier >> then instantiate a {@link AlarmClassifier} proxy.
     * 
     * @return a {@link AlarmClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("4319a6e6-6d2c-4b56-8320-5532aae4a406")
    public static AlarmClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmClassifier.STEREOTYPE_NAME);
        return AlarmClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link AlarmClassifier} proxy from a {@link Classifier} stereotyped << Alarm_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link AlarmClassifier} proxy or <i>null</i>.
     */
    @objid ("672d47b2-f10c-4ff0-8a92-03707a7a570e")
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
    @objid ("575df11f-0adb-4b4e-8b30-8f0a1d64783d")
    public static AlarmClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (AlarmClassifier.canInstantiate(obj))
        	return new AlarmClassifier(obj);
        else
        	throw new IllegalArgumentException("AlarmClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("68575d5f-2b8d-4bfc-91f5-0f43b81e0b72")
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
    @objid ("068122a1-743a-4f0b-998f-82a100936076")
    public List<String> getAlarm_Classifier_timers() {
        return this.elt.getTagValues(AlarmClassifier.MdaTypes.ALARM_CLASSIFIER_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("82694880-a7d5-45d9-b1c7-f4c2ac214b45")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("bd775537-1d10-45b0-97c1-9297ff1aa2b3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Classifier_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7080212-0fd8-4e44-8b0e-c18b225ae365")
    public boolean isAlarm_Classifier_isWatchdog() {
        return this.elt.isTagged(AlarmClassifier.MdaTypes.ALARM_CLASSIFIER_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Classifier_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84dcebae-1f15-43e2-b1b4-5070ad12efdc")
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
    @objid ("6faa4f47-85f6-4381-8a16-8239adccb2ef")
    public void setAlarm_Classifier_timers(final List<String> values) {
        this.elt.putTagValues(AlarmClassifier.MdaTypes.ALARM_CLASSIFIER_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("a9efd8e2-2142-4d41-ae2e-e695d703539e")
    protected AlarmClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("1f205612-4e6e-4dd1-b3e6-6e58dca14e4a")
    public static final class MdaTypes {
        @objid ("e3ae8707-883f-4af0-bed6-6e3bc5b5f67c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("abf64c66-46b5-4db1-9422-292017d9ce69")
        public static TagType ALARM_CLASSIFIER_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("bfbd0c51-c2dd-4674-a68a-24ae566017cb")
        public static TagType ALARM_CLASSIFIER_TIMERS_TAGTYPE_ELT;

        @objid ("f29fedff-ea0a-491b-b7bf-156f8342f36c")
        private static Stereotype MDAASSOCDEP;

        @objid ("09129c8c-a327-4d5b-b07c-afef8f6a6883")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ac7dd1a-0429-40c7-9286-9d7723540f0d")
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
