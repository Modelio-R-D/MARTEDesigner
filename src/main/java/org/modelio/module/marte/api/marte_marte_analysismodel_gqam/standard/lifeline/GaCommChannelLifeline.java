/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("fd2ec7a9-cd2b-409d-a1db-6876b7538712")
    public static final String STEREOTYPE_NAME = "GaCommChannel_Lifeline";

    @objid ("63145dda-77f2-40e9-8bb9-8a2e77589bc5")
    public static final String GACOMMCHANNEL_LIFELINE_PACKETSIZE_TAGTYPE = "GaCommChannel_Lifeline_packetSize";

    @objid ("22f493e1-d541-4fa0-9e65-0109b6f7e60d")
    public static final String GACOMMCHANNEL_LIFELINE_UTILIZATION_TAGTYPE = "GaCommChannel_Lifeline_utilization";

    /**
     * Tells whether a {@link GaCommChannelLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << GaCommChannel_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6c773526-a636-4e6a-95c5-3ed5b6768348")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << GaCommChannel_Lifeline >> then instantiate a {@link GaCommChannelLifeline} proxy.
     * 
     * @return a {@link GaCommChannelLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("23ebff8d-f459-492b-b78c-f1d81eccc182")
    public static GaCommChannelLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelLifeline.STEREOTYPE_NAME);
        return GaCommChannelLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelLifeline} proxy from a {@link Lifeline} stereotyped << GaCommChannel_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link GaCommChannelLifeline} proxy or <i>null</i>.
     */
    @objid ("e376cee9-a0e7-4f3b-8a0b-3f8418136b2c")
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
    @objid ("00f967f0-0eb0-489d-8ece-466475fe28d1")
    public static GaCommChannelLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (GaCommChannelLifeline.canInstantiate(obj))
        	return new GaCommChannelLifeline(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f9cb7d74-eefa-4a6b-9ce8-9dcae865540e")
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
    @objid ("d25f5882-1214-4567-8f7a-1368120acff9")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Lifeline_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0596801a-51c5-4c44-8b28-02eb546410ff")
    public String getGaCommChannel_Lifeline_packetSize() {
        return this.elt.getTagValue(GaCommChannelLifeline.MdaTypes.GACOMMCHANNEL_LIFELINE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Lifeline_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c9dd25a8-2be0-44a6-8360-a2d5c480fd4b")
    public List<String> getGaCommChannel_Lifeline_utilization() {
        return this.elt.getTagValues(GaCommChannelLifeline.MdaTypes.GACOMMCHANNEL_LIFELINE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("a2fde59b-0a68-4e8b-bbe9-52e1804b10ad")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Lifeline_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("15cb9ae4-d55f-4323-875f-71a5899e5264")
    public void setGaCommChannel_Lifeline_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelLifeline.MdaTypes.GACOMMCHANNEL_LIFELINE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Lifeline_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7af5f56-45ee-4d60-b0b8-bc86dea008d3")
    public void setGaCommChannel_Lifeline_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelLifeline.MdaTypes.GACOMMCHANNEL_LIFELINE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("6a18b013-4d55-4492-8057-fe1e94828771")
    protected GaCommChannelLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("e264071e-c9c7-459b-a75d-86164a22bbda")
    public static final class MdaTypes {
        @objid ("61176b69-445e-4844-a827-3e230ad66895")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7e73d065-4d98-47d4-9b06-3de420ea3bb0")
        public static TagType GACOMMCHANNEL_LIFELINE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("5e4beca8-3286-4322-a13e-59336521ae9c")
        public static TagType GACOMMCHANNEL_LIFELINE_UTILIZATION_TAGTYPE_ELT;

        @objid ("138ac035-69c4-45b5-9ba7-6a5b461a511d")
        private static Stereotype MDAASSOCDEP;

        @objid ("9296e1da-a214-4f93-8ab2-5070cd26678b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("77aa257d-7abf-4695-a0d5-ba8697d38bce")
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
