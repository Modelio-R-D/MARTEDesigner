/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association.HwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwISA_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwISAAssociation extends HwResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwISA_Association";

    public static final String HWISA_ASSOCIATION_FAMILY_TAGTYPE = "HwISA_Association_family";

    public static final String HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE = "HwISA_Association_inst_Width";

    public static final String HWISA_ASSOCIATION_TYPE_TAGTYPE = "HwISA_Association_type";

    /**
     * Tells whether a {@link HwISAAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwISA_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwISA_Association >> then instantiate a {@link HwISAAssociation} proxy.
     * 
     * @return a {@link HwISAAssociation} proxy on the created {@link Association}.
     */
    public static HwISAAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAssociation.STEREOTYPE_NAME);
        return HwISAAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwISAAssociation} proxy from a {@link Association} stereotyped << HwISA_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwISAAssociation} proxy or <i>null</i>.
     */
    public static HwISAAssociation instantiate(final Association obj) {
        return HwISAAssociation.canInstantiate(obj) ? new HwISAAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISAAssociation} proxy from a {@link Association} stereotyped << HwISA_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwISAAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwISAAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwISAAssociation.canInstantiate(obj))
        	return new HwISAAssociation(obj);
        else
        	throw new IllegalArgumentException("HwISAAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwISAAssociation other = (HwISAAssociation) obj;
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
     * Getter for string property 'HwISA_Association_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Association_family() {
        return this.elt.getTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Association_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Association_inst_Width() {
        return this.elt.getTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwISA_Association_type() {
        return this.elt.getTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Association_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Association_family(final String value) {
        this.elt.putTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Association_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Association_inst_Width(final String value) {
        this.elt.putTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwISA_Association_type(final String value) {
        this.elt.putTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    protected HwISAAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWISA_ASSOCIATION_FAMILY_TAGTYPE_ELT;

        public static TagType HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE_ELT;

        public static TagType HWISA_ASSOCIATION_TYPE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "39ef8fa9-10a7-11df-81d9-0014222a9f79");
            HWISA_ASSOCIATION_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "39ef8faa-10a7-11df-81d9-0014222a9f79");
            HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "39ef8fab-10a7-11df-81d9-0014222a9f79");
            HWISA_ASSOCIATION_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "39ef8fac-10a7-11df-81d9-0014222a9f79");
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
