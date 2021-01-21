/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.SchedulableResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << GaCommChannel_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c465fdb0-101f-4e95-8696-7abb298c6f23")
public class GaCommChannelAssociation extends SchedulableResourceAssociation {
    @objid ("85e6832c-43da-4255-aafa-f76aaf6e1dd4")
    public static final String STEREOTYPE_NAME = "GaCommChannel_Association";

    @objid ("a474b601-b2fa-407d-9301-fd327e6e9b05")
    public static final String GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE = "GaCommChannel_Association_packetSize";

    @objid ("74d2c8c4-1311-44d9-9a78-084ad177645e")
    public static final String GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE = "GaCommChannel_Association_utilization";

    /**
     * Tells whether a {@link GaCommChannelAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << GaCommChannel_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fa7c8e81-3e97-4994-950a-a3fc8ef571e4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << GaCommChannel_Association >> then instantiate a {@link GaCommChannelAssociation} proxy.
     * 
     * @return a {@link GaCommChannelAssociation} proxy on the created {@link Association}.
     */
    @objid ("5bb0e626-9eb8-47e7-950c-14c7005dde8a")
    public static GaCommChannelAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAssociation.STEREOTYPE_NAME);
        return GaCommChannelAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelAssociation} proxy from a {@link Association} stereotyped << GaCommChannel_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link GaCommChannelAssociation} proxy or <i>null</i>.
     */
    @objid ("6f8283b0-3f74-443d-b650-2429c93c1d7e")
    public static GaCommChannelAssociation instantiate(final Association obj) {
        return GaCommChannelAssociation.canInstantiate(obj) ? new GaCommChannelAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommChannelAssociation} proxy from a {@link Association} stereotyped << GaCommChannel_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link GaCommChannelAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("181279fc-5cec-46d3-8f4f-36845ad736d7")
    public static GaCommChannelAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (GaCommChannelAssociation.canInstantiate(obj))
        	return new GaCommChannelAssociation(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2da295d4-afe5-4418-9b67-554dca41309b")
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
        GaCommChannelAssociation other = (GaCommChannelAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("cf2fe06d-c75d-4550-a548-f87ca6b1afff")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bee8a311-2a3b-4070-9c3b-a8fc10e09a40")
    public String getGaCommChannel_Association_packetSize() {
        return this.elt.getTagValue(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Association_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("893e1eec-dcb7-4534-91c9-f30bf66d1bec")
    public List<String> getGaCommChannel_Association_utilization() {
        return this.elt.getTagValues(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("8791653c-6b3f-4ee0-a994-21fd5da62fca")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45fbb2d5-ecb6-4cf2-b43a-5e0c37c0c092")
    public void setGaCommChannel_Association_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Association_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34478a87-3853-479c-9a42-cb928770dc87")
    public void setGaCommChannel_Association_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("f72c3bea-3dda-4cbf-bae0-ca08b5183a33")
    protected GaCommChannelAssociation(final Association elt) {
        super(elt);
    }

    @objid ("9f7359ed-0273-40bc-bb9d-2e10517dfc9c")
    public static final class MdaTypes {
        @objid ("660b4114-df55-4e2b-9715-19a98a1690c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1fed911a-6db6-4747-9bb1-753b6599a76a")
        public static TagType GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT;

        @objid ("a0b998b8-e251-42a6-9473-a460291c9b17")
        public static TagType GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT;

        @objid ("4354eceb-7365-4efc-b38c-b2a48faf2462")
        private static Stereotype MDAASSOCDEP;

        @objid ("d081005c-0545-4171-98c4-9594c4f31fac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cd813e27-cf55-4f55-8d2e-31878931af88")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eda7c7ca-149e-11df-9d54-0014222a9f79");
            GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "eda7c7cb-149e-11df-9d54-0014222a9f79");
            GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "eda7c7cc-149e-11df-9d54-0014222a9f79");
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
