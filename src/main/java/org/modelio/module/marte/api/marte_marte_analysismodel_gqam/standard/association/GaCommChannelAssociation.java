/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("91053aa7-55f5-4d0d-9e10-3cbd514e952a")
    public static final String STEREOTYPE_NAME = "GaCommChannel_Association";

    @objid ("aa25d62a-afaa-47c7-9dc6-22529dac7950")
    public static final String GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE = "GaCommChannel_Association_packetSize";

    @objid ("cbfe2944-7742-4c55-80bf-5637a2dd496e")
    public static final String GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE = "GaCommChannel_Association_utilization";

    /**
     * Tells whether a {@link GaCommChannelAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << GaCommChannel_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("210f54d7-9281-4647-b77f-ed8f5b0fd307")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << GaCommChannel_Association >> then instantiate a {@link GaCommChannelAssociation} proxy.
     * 
     * @return a {@link GaCommChannelAssociation} proxy on the created {@link Association}.
     */
    @objid ("d4481ba1-03c7-4b72-acee-0409b48909ba")
    public static GaCommChannelAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAssociation.STEREOTYPE_NAME);
        return GaCommChannelAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelAssociation} proxy from a {@link Association} stereotyped << GaCommChannel_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link GaCommChannelAssociation} proxy or <i>null</i>.
     */
    @objid ("9fda8651-1905-4a33-bb70-bc7432270280")
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
    @objid ("c92c1367-4143-45dc-a2e1-e8322c1169b7")
    public static GaCommChannelAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (GaCommChannelAssociation.canInstantiate(obj))
        	return new GaCommChannelAssociation(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("475cd772-85bd-4cf7-94f9-c36659f371bd")
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
    @objid ("f201b3e9-83f3-4f5c-9f52-e447465a1937")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f44884a-54a4-4239-b2cc-302f605e76de")
    public String getGaCommChannel_Association_packetSize() {
        return this.elt.getTagValue(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Association_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("36b3def8-9731-47d6-8920-a754fa5ff130")
    public List<String> getGaCommChannel_Association_utilization() {
        return this.elt.getTagValues(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("18deae3e-901e-4fcc-9029-f72a9d0e7320")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85af8e8d-6fdc-4344-b607-672885f41994")
    public void setGaCommChannel_Association_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Association_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac01d6c0-37a3-42ad-94fe-99bb1de852bd")
    public void setGaCommChannel_Association_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("f49c4946-351e-456a-9b68-6e9000e3731e")
    protected GaCommChannelAssociation(final Association elt) {
        super(elt);
    }

    @objid ("9f7359ed-0273-40bc-bb9d-2e10517dfc9c")
    public static final class MdaTypes {
        @objid ("b1a1f223-2904-44a6-97d1-5a62f549302b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf500853-97fd-42aa-99b0-97409091f602")
        public static TagType GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT;

        @objid ("678f2ac3-2f53-4d78-bd25-db03ecd48522")
        public static TagType GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT;

        @objid ("96394701-b53f-40d3-a309-64550407ee76")
        private static Stereotype MDAASSOCDEP;

        @objid ("f63d3260-768a-4338-8ad9-db3ef04d5bce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2b442bbc-8f5e-4567-b487-a7e35b79bc17")
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
