/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaCommHostAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SaCommHost_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaCommHostAssociation extends GaCommHostAssociation {
    public static final String STEREOTYPE_NAME = "SaCommHost_Association";

    public static final String SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE = "SaCommHost_Association_isSched";

    public static final String SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE = "SaCommHost_Association_schSlack";

    /**
     * Tells whether a {@link SaCommHostAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SaCommHost_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SaCommHost_Association >> then instantiate a {@link SaCommHostAssociation} proxy.
     * 
     * @return a {@link SaCommHostAssociation} proxy on the created {@link Association}.
     */
    public static SaCommHostAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAssociation.STEREOTYPE_NAME);
        return SaCommHostAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostAssociation} proxy from a {@link Association} stereotyped << SaCommHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SaCommHostAssociation} proxy or <i>null</i>.
     */
    public static SaCommHostAssociation instantiate(final Association obj) {
        return SaCommHostAssociation.canInstantiate(obj) ? new SaCommHostAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostAssociation} proxy from a {@link Association} stereotyped << SaCommHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SaCommHostAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaCommHostAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SaCommHostAssociation.canInstantiate(obj))
        	return new SaCommHostAssociation(obj);
        else
        	throw new IllegalArgumentException("SaCommHostAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaCommHostAssociation other = (SaCommHostAssociation) obj;
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
     * Getter for string property 'SaCommHost_Association_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaCommHost_Association_schSlack() {
        return this.elt.getTagValue(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Association_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaCommHost_Association_isSched() {
        return this.elt.isTagged(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Association_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Association_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Association_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Association_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT, value);
    }

    protected SaCommHostAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT;

        public static TagType SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b3a8fff1-14ad-11df-9d54-0014222a9f79");
            SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3a8fff2-14ad-11df-9d54-0014222a9f79");
            SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3a8fff3-14ad-11df-9d54-0014222a9f79");
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
