/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier;

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
public class GaCommChannelClassifier extends SchedulableResourceClassifier {
    public static final String STEREOTYPE_NAME = "GaCommChannel_Classifier";

    public static final String GACOMMCHANNEL_CLASSIFIER_PACKETSIZE_TAGTYPE = "GaCommChannel_Classifier_packetSize";

    public static final String GACOMMCHANNEL_CLASSIFIER_UTILIZATION_TAGTYPE = "GaCommChannel_Classifier_utilization";

    /**
     * Tells whether a {@link GaCommChannelClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << GaCommChannel_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << GaCommChannel_Classifier >> then instantiate a {@link GaCommChannelClassifier} proxy.
     * 
     * @return a {@link GaCommChannelClassifier} proxy on the created {@link Classifier}.
     */
    public static GaCommChannelClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelClassifier.STEREOTYPE_NAME);
        return GaCommChannelClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelClassifier} proxy from a {@link Classifier} stereotyped << GaCommChannel_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link GaCommChannelClassifier} proxy or <i>null</i>.
     */
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
    public static GaCommChannelClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (GaCommChannelClassifier.canInstantiate(obj))
        	return new GaCommChannelClassifier(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommChannelClassifier other = (GaCommChannelClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Classifier_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommChannel_Classifier_packetSize() {
        return this.elt.getTagValue(GaCommChannelClassifier.MdaTypes.GACOMMCHANNEL_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Classifier_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommChannel_Classifier_utilization() {
        return this.elt.getTagValues(GaCommChannelClassifier.MdaTypes.GACOMMCHANNEL_CLASSIFIER_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Classifier_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Classifier_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelClassifier.MdaTypes.GACOMMCHANNEL_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Classifier_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Classifier_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelClassifier.MdaTypes.GACOMMCHANNEL_CLASSIFIER_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommChannelClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMCHANNEL_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT;

        public static TagType GACOMMCHANNEL_CLASSIFIER_UTILIZATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
