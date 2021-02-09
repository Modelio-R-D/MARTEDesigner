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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaExecHostAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SaExecHost_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaExecHostAssociation extends GaExecHostAssociation {
    public static final String STEREOTYPE_NAME = "SaExecHost_Association";

    public static final String SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE = "SaExecHost_Association_ISRprioRange";

    public static final String SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE = "SaExecHost_Association_ISRswitchT";

    public static final String SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE = "SaExecHost_Association_isSched";

    public static final String SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE = "SaExecHost_Association_schSlack";

    public static final String SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Association_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SaExecHost_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SaExecHost_Association >> then instantiate a {@link SaExecHostAssociation} proxy.
     * 
     * @return a {@link SaExecHostAssociation} proxy on the created {@link Association}.
     */
    public static SaExecHostAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAssociation.STEREOTYPE_NAME);
        return SaExecHostAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostAssociation} proxy from a {@link Association} stereotyped << SaExecHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SaExecHostAssociation} proxy or <i>null</i>.
     */
    public static SaExecHostAssociation instantiate(final Association obj) {
        return SaExecHostAssociation.canInstantiate(obj) ? new SaExecHostAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostAssociation} proxy from a {@link Association} stereotyped << SaExecHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SaExecHostAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaExecHostAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SaExecHostAssociation.canInstantiate(obj))
        	return new SaExecHostAssociation(obj);
        else
        	throw new IllegalArgumentException("SaExecHostAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaExecHostAssociation other = (SaExecHostAssociation) obj;
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
     * Getter for string property 'SaExecHost_Association_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_Association_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Association_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_Association_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Association_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_Association_schSlack() {
        return this.elt.getTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Association_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_Association_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Association_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaExecHost_Association_isSched() {
        return this.elt.isTagged(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Association_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Association_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Association_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Association_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Association_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Association_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Association_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Association_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Association_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Association_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostAssociation.MdaTypes.SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    protected SaExecHostAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f85b1781-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1782-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1783-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1784-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1785-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_ASSOCIATION_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f85b1786-14ad-11df-9d54-0014222a9f79");
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
