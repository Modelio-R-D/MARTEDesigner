/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwMedia_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("20e83f67-6a8a-436e-9c78-69c34f77336d")
public class HwMediaAssociation extends HwCommunicationResourceAssociation {
    @objid ("1a08e276-c3f2-4ab5-8219-78fc54fde8b0")
    public static final String STEREOTYPE_NAME = "HwMedia_Association";

    @objid ("7ae70c4d-a7fd-4eb0-9c16-6908d90324de")
    public static final String HWMEDIA_ASSOCIATION_ARBITERS_TAGTYPE = "HwMedia_Association_arbiters";

    @objid ("6a588a3e-f387-4429-830c-60a2ddc65476")
    public static final String HWMEDIA_ASSOCIATION_BANDWIDTH_TAGTYPE = "HwMedia_Association_bandwidth";

    /**
     * Tells whether a {@link HwMediaAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwMedia_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("949e3922-dd65-4b55-8936-41bf54d1c397")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwMedia_Association >> then instantiate a {@link HwMediaAssociation} proxy.
     * 
     * @return a {@link HwMediaAssociation} proxy on the created {@link Association}.
     */
    @objid ("601e0ce7-2d29-4516-a162-540c995c250d")
    public static HwMediaAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaAssociation.STEREOTYPE_NAME);
        return HwMediaAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaAssociation} proxy from a {@link Association} stereotyped << HwMedia_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwMediaAssociation} proxy or <i>null</i>.
     */
    @objid ("80da9295-a25c-4807-98c8-c948c41a4edd")
    public static HwMediaAssociation instantiate(final Association obj) {
        return HwMediaAssociation.canInstantiate(obj) ? new HwMediaAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaAssociation} proxy from a {@link Association} stereotyped << HwMedia_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwMediaAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3865f188-e87a-4f4e-9cc5-7ad310bb5c73")
    public static HwMediaAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwMediaAssociation.canInstantiate(obj))
        	return new HwMediaAssociation(obj);
        else
        	throw new IllegalArgumentException("HwMediaAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bfe4ef47-c1b0-450e-892b-ea5781bcc17b")
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
        HwMediaAssociation other = (HwMediaAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("fb37e4f3-ddea-4c9c-a4eb-ed7aa2b3cd79")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Association_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f22312b1-59f4-4d90-9d55-74a22e9a4ac3")
    public List<String> getHwMedia_Association_arbiters() {
        return this.elt.getTagValues(HwMediaAssociation.MdaTypes.HWMEDIA_ASSOCIATION_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Association_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1675ac7-3c66-4648-82c7-f56d0a09c4c0")
    public String getHwMedia_Association_bandwidth() {
        return this.elt.getTagValue(HwMediaAssociation.MdaTypes.HWMEDIA_ASSOCIATION_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("b0432aec-4d31-496a-96cf-9da9b4d6b30f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Association_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69e5a87c-1e69-4281-a1c9-35df0fc374bb")
    public void setHwMedia_Association_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaAssociation.MdaTypes.HWMEDIA_ASSOCIATION_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Association_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98a4de5c-e40d-4d37-bb2e-92d26efc48c3")
    public void setHwMedia_Association_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaAssociation.MdaTypes.HWMEDIA_ASSOCIATION_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("74f7d24e-c544-4b20-a09e-ea9af38a787e")
    protected HwMediaAssociation(final Association elt) {
        super(elt);
    }

    @objid ("bbd28c03-a892-4c58-8b1a-34f2347fa48b")
    public static final class MdaTypes {
        @objid ("529bac8b-9d70-483a-a889-e2ce32426e6a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4b1a268e-e3f7-41c7-b3e1-24d6bfd5b55b")
        public static TagType HWMEDIA_ASSOCIATION_ARBITERS_TAGTYPE_ELT;

        @objid ("1915404b-739f-46d6-b61f-0e9cf8cbfa19")
        public static TagType HWMEDIA_ASSOCIATION_BANDWIDTH_TAGTYPE_ELT;

        @objid ("ea911c3e-f801-44cd-a14a-d0ed82d89b88")
        private static Stereotype MDAASSOCDEP;

        @objid ("c7ff62d6-80e0-401e-9a66-e8c76ac8647d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86c2206b-446d-46b1-a452-8c5f74ddc96e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b7b9110b-10ac-11df-81d9-0014222a9f79");
            HWMEDIA_ASSOCIATION_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "08261b5c-1727-11df-b92a-0014222a9f79");
            HWMEDIA_ASSOCIATION_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7c033e63-5d9c-11df-9e91-0014222a9f79");
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
