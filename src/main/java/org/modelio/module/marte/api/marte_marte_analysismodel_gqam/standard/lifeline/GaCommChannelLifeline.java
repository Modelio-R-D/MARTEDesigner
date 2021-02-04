/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.SchedulableResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << GaCommChannel_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8750af39-a401-4bee-9d4b-4471622777c8")
public class GaCommChannelLifeline extends SchedulableResourceLifeline {
    @objid ("c1daaf06-4f19-4cda-94e3-a861e4938050")
    public static final String STEREOTYPE_NAME = "GaCommChannel_Lifeline";

    @objid ("0599ce6f-9342-4588-8748-a08892898c31")
    public static final String GACOMMCHANNEL_LIFELINE_PACKETSIZE_TAGTYPE = "GaCommChannel_Lifeline_packetSize";

    @objid ("76cfcf09-26ef-4309-a49f-3ebfc948c25e")
    public static final String GACOMMCHANNEL_LIFELINE_UTILIZATION_TAGTYPE = "GaCommChannel_Lifeline_utilization";

    /**
     * Tells whether a {@link GaCommChannelLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << GaCommChannel_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9f9215f0-b02b-4a6c-b2b1-19f65a4492a2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << GaCommChannel_Lifeline >> then instantiate a {@link GaCommChannelLifeline} proxy.
     * 
     * @return a {@link GaCommChannelLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("1877a798-ca69-4945-8d34-4a4c7c77c21f")
    public static GaCommChannelLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelLifeline.STEREOTYPE_NAME);
        return GaCommChannelLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelLifeline} proxy from a {@link Lifeline} stereotyped << GaCommChannel_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link GaCommChannelLifeline} proxy or <i>null</i>.
     */
    @objid ("c9993eac-2bef-461a-be24-47d0cecf4707")
    public static GaCommChannelLifeline instantiate(final Lifeline obj) {
        return GaCommChannelLifeline.canInstantiate(obj) ? new GaCommChannelLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommChannelLifeline} proxy from a {@link Lifeline} stereotyped << GaCommChannel_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link GaCommChannelLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("94850b5c-1c9d-4405-ba0f-e93e41f4e672")
    public static GaCommChannelLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (GaCommChannelLifeline.canInstantiate(obj))
        	return new GaCommChannelLifeline(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("17d0e4bd-0636-4a89-a59f-d0895e391b98")
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
        GaCommChannelLifeline other = (GaCommChannelLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("e315348e-1e5d-4750-9ad1-68d80b201852")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Lifeline_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c2c47cd-35f9-4c9f-8ce6-8ca382102d2e")
    public String getGaCommChannel_Lifeline_packetSize() {
        return this.elt.getTagValue(GaCommChannelLifeline.MdaTypes.GACOMMCHANNEL_LIFELINE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Lifeline_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c42d6c07-0905-41c3-9d70-ebc3c64b4945")
    public List<String> getGaCommChannel_Lifeline_utilization() {
        return this.elt.getTagValues(GaCommChannelLifeline.MdaTypes.GACOMMCHANNEL_LIFELINE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("e4019936-6b41-4cd9-adb6-6a0d1e2484ed")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Lifeline_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("212cdf0b-ae49-4809-aeaa-2eec08133f09")
    public void setGaCommChannel_Lifeline_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelLifeline.MdaTypes.GACOMMCHANNEL_LIFELINE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Lifeline_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9dd41b6d-7b51-4eac-9d00-a12cfdb39295")
    public void setGaCommChannel_Lifeline_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelLifeline.MdaTypes.GACOMMCHANNEL_LIFELINE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("95b0ac98-5740-4c34-938a-792c12fb991b")
    protected GaCommChannelLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("e264071e-c9c7-459b-a75d-86164a22bbda")
    public static final class MdaTypes {
        @objid ("d3946034-771a-49bd-a68b-f71019f3ac1a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a0d7779-3d50-4fcd-8b25-1fc2c513401e")
        public static TagType GACOMMCHANNEL_LIFELINE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("69c454fa-0f08-479e-9da6-3a84d4e6c00d")
        public static TagType GACOMMCHANNEL_LIFELINE_UTILIZATION_TAGTYPE_ELT;

        @objid ("827153d0-7c91-4eef-a9c5-d3fe2373df6a")
        private static Stereotype MDAASSOCDEP;

        @objid ("bded3b13-4b67-4249-80f2-7418a771ec50")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48bf3d09-d72e-4c7f-9238-dbda5f82e3cd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "edc6c683-149e-11df-9d54-0014222a9f79");
            GACOMMCHANNEL_LIFELINE_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "edc6c684-149e-11df-9d54-0014222a9f79");
            GACOMMCHANNEL_LIFELINE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "edc6c685-149e-11df-9d54-0014222a9f79");
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
