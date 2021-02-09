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
public class GaCommChannelAssociation extends SchedulableResourceAssociation {
    public static final String STEREOTYPE_NAME = "GaCommChannel_Association";

    public static final String GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE = "GaCommChannel_Association_packetSize";

    public static final String GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE = "GaCommChannel_Association_utilization";

    /**
     * Tells whether a {@link GaCommChannelAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << GaCommChannel_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << GaCommChannel_Association >> then instantiate a {@link GaCommChannelAssociation} proxy.
     * 
     * @return a {@link GaCommChannelAssociation} proxy on the created {@link Association}.
     */
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
    public static GaCommChannelAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (GaCommChannelAssociation.canInstantiate(obj))
        	return new GaCommChannelAssociation(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommChannelAssociation other = (GaCommChannelAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommChannel_Association_packetSize() {
        return this.elt.getTagValue(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Association_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommChannel_Association_utilization() {
        return this.elt.getTagValues(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Association_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Association_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Association_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Association_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelAssociation.MdaTypes.GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommChannelAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMCHANNEL_ASSOCIATION_PACKETSIZE_TAGTYPE_ELT;

        public static TagType GACOMMCHANNEL_ASSOCIATION_UTILIZATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
