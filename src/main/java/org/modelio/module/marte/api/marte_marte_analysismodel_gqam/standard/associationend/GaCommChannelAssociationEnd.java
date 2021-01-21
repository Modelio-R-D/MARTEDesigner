/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.SchedulableResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << GaCommChannel_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("479388e9-1619-4b65-beec-b8b8a1d287bd")
public class GaCommChannelAssociationEnd extends SchedulableResourceAssociationEnd {
    @objid ("e8e318b8-f175-4f97-af9d-58ceed235c98")
    public static final String STEREOTYPE_NAME = "GaCommChannel_AssociationEnd";

    @objid ("2b95dd25-30c0-4fd2-b7e7-e535987d873a")
    public static final String GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE_TAGTYPE = "GaCommChannel_AssociationEnd_packetSize";

    @objid ("50ea994a-9fa1-4a6f-af96-43493ce31c9e")
    public static final String GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION_TAGTYPE = "GaCommChannel_AssociationEnd_utilization";

    /**
     * Tells whether a {@link GaCommChannelAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << GaCommChannel_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("de2a0602-f57b-49e2-ad9d-f7f9132ba96b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << GaCommChannel_AssociationEnd >> then instantiate a {@link GaCommChannelAssociationEnd} proxy.
     * 
     * @return a {@link GaCommChannelAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("ac365960-05fe-4011-9f65-7b37e65751b1")
    public static GaCommChannelAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAssociationEnd.STEREOTYPE_NAME);
        return GaCommChannelAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << GaCommChannel_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link GaCommChannelAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("538a00d8-4e53-42cb-85d4-552c6a44c68e")
    public static GaCommChannelAssociationEnd instantiate(final AssociationEnd obj) {
        return GaCommChannelAssociationEnd.canInstantiate(obj) ? new GaCommChannelAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommChannelAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << GaCommChannel_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link GaCommChannelAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("61a18b53-fdab-4f55-a82c-8e3f1e062be6")
    public static GaCommChannelAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (GaCommChannelAssociationEnd.canInstantiate(obj))
        	return new GaCommChannelAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8383b3ff-19b2-4027-b180-2ee7c651e0b2")
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
        GaCommChannelAssociationEnd other = (GaCommChannelAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("c79c2078-9f46-4945-b555-73cee3010ef7")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_AssociationEnd_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2bc0ce55-84fd-4351-91b4-f219c1f83447")
    public String getGaCommChannel_AssociationEnd_packetSize() {
        return this.elt.getTagValue(GaCommChannelAssociationEnd.MdaTypes.GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_AssociationEnd_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("17f3cd6c-5c11-466d-b3c8-8ed0595738d6")
    public List<String> getGaCommChannel_AssociationEnd_utilization() {
        return this.elt.getTagValues(GaCommChannelAssociationEnd.MdaTypes.GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("ff26f017-8699-4827-a687-55db8f3c1a88")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_AssociationEnd_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("858a1481-71f7-46a1-913f-89cb589ceaa6")
    public void setGaCommChannel_AssociationEnd_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelAssociationEnd.MdaTypes.GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_AssociationEnd_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9277e11c-7ea7-49fc-ac85-f55559b386a1")
    public void setGaCommChannel_AssociationEnd_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelAssociationEnd.MdaTypes.GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("1e9710b5-f3f2-4d97-8ea4-1d4d318a6cb8")
    protected GaCommChannelAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("c003951e-a4a3-4894-be17-071aa9015e2e")
    public static final class MdaTypes {
        @objid ("5365237f-90eb-4f53-8154-67f21061e8ec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f9c136e1-829d-4893-b053-00ab818492f8")
        public static TagType GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE_TAGTYPE_ELT;

        @objid ("a979b6b6-2f71-4edf-8917-602321ea74b5")
        public static TagType GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT;

        @objid ("20f0b389-ea63-4cf4-926a-92d806096b4e")
        private static Stereotype MDAASSOCDEP;

        @objid ("c18f2ccf-c9e6-48ff-a28b-3902dfca75fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("00e4054d-46e9-4766-a366-4f0cd78444f6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "036ce3e8-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f4631-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f4638-0ccf-11df-8525-001302895b2b");
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
