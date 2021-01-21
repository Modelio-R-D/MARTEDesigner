/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.SchedulableResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << GaCommChannel_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b85ba477-fa52-4fa7-bc9e-eb2192a85005")
public class GaCommChannelClassifier extends SchedulableResourceClassifier {
    @objid ("086d070a-cd32-42b8-8fa6-ea60c50cfce1")
    public static final String STEREOTYPE_NAME = "GaCommChannel_Classifier";

    @objid ("61fda26f-2f62-4af7-a4eb-f0f9300ef004")
    public static final String GACOMMCHANNEL_CLASSIFIER_PACKETSIZE_TAGTYPE = "GaCommChannel_Classifier_packetSize";

    @objid ("dc8c5802-2518-4c83-a4ec-34ae38d5429f")
    public static final String GACOMMCHANNEL_CLASSIFIER_UTILIZATION_TAGTYPE = "GaCommChannel_Classifier_utilization";

    /**
     * Tells whether a {@link GaCommChannelClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << GaCommChannel_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9b2ae982-7654-4d28-bb29-b4f851db979d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << GaCommChannel_Classifier >> then instantiate a {@link GaCommChannelClassifier} proxy.
     * 
     * @return a {@link GaCommChannelClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("c987d811-8ec3-4803-9084-322e627159e0")
    public static GaCommChannelClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelClassifier.STEREOTYPE_NAME);
        return GaCommChannelClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelClassifier} proxy from a {@link Classifier} stereotyped << GaCommChannel_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link GaCommChannelClassifier} proxy or <i>null</i>.
     */
    @objid ("39b5075e-34f1-4a13-8d13-01fb06ab0fa7")
    public static GaCommChannelClassifier instantiate(final Classifier obj) {
        return GaCommChannelClassifier.canInstantiate(obj) ? new GaCommChannelClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommChannelClassifier} proxy from a {@link Classifier} stereotyped << GaCommChannel_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link GaCommChannelClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6bc0e876-4570-4b2e-a6ab-56d3503ac4f6")
    public static GaCommChannelClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (GaCommChannelClassifier.canInstantiate(obj))
        	return new GaCommChannelClassifier(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c1f0a77c-404f-41b4-b8aa-5af9a7ca86b3")
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
        GaCommChannelClassifier other = (GaCommChannelClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("af657e7d-2009-462e-b324-5a2d7501c0a5")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Classifier_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0393bd4-7b9f-415c-adc1-e0a55079ca9b")
    public String getGaCommChannel_Classifier_packetSize() {
        return this.elt.getTagValue(GaCommChannelClassifier.MdaTypes.GACOMMCHANNEL_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Classifier_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e5e08561-2d0a-4b35-81c9-a7256d438782")
    public List<String> getGaCommChannel_Classifier_utilization() {
        return this.elt.getTagValues(GaCommChannelClassifier.MdaTypes.GACOMMCHANNEL_CLASSIFIER_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("7c249718-6b7f-4c27-a7bd-6b9d0cdb4740")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Classifier_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("392c41c9-1f41-41fe-9281-6f36d32d7d48")
    public void setGaCommChannel_Classifier_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelClassifier.MdaTypes.GACOMMCHANNEL_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c64531d8-6fe9-4b3a-a272-cf310439531e")
    public void setGaCommChannel_Classifier_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelClassifier.MdaTypes.GACOMMCHANNEL_CLASSIFIER_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("f93ac574-435d-439f-881b-accf8c14e092")
    protected GaCommChannelClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("ea028b30-5249-455c-9e0c-65bf0406b038")
    public static final class MdaTypes {
        @objid ("3152dce8-0de3-4cc4-9173-ffe9cd12fb3c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d5e0dd0c-f535-401f-90e7-2a1cdec01426")
        public static TagType GACOMMCHANNEL_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT;

        @objid ("653621f6-569f-48c5-a10c-7c67c557e9dc")
        public static TagType GACOMMCHANNEL_CLASSIFIER_UTILIZATION_TAGTYPE_ELT;

        @objid ("df4a63c2-16f0-4b18-a0a0-17668b20e686")
        private static Stereotype MDAASSOCDEP;

        @objid ("9138cd97-d335-4953-b9ad-93ae4a8dab91")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("03fb8be4-cdfa-4998-8d9e-a4752ff8463b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ede362df-149e-11df-9d54-0014222a9f79");
            GACOMMCHANNEL_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ede362e0-149e-11df-9d54-0014222a9f79");
            GACOMMCHANNEL_CLASSIFIER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ede362e1-149e-11df-9d54-0014222a9f79");
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
